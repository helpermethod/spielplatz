node {
    stage 'Checkout'

    git 'https://github.com/helpermethod/spielplatz'

    stage 'Start Test DB'

    sh '''
        set +e
        docker rm -f postgres-test
        set -e
        docker run \
          --name postgres-test \
          -e POSTGRES_PASSWORD=spielplatz \
          -e POSTGRES_USER=spielplatz \
          -e POSTGRES_DB=spielplatz \
          -d \
          postgres:9.6.0
    '''

    stage 'Build'

    def ip = getIp 'postgres-test'
    env.DB_IP = ip

    withEnv(["PATH+MAVEN=${tool 'mvn3'}/bin"]) {
        sh 'mvn clean package'
        sh "docker build -t spielplatz:$BUILD_NUMBER ."
    }

    def prodIp = getIp 'postgres-spielplatz-prod'
    prodIp = prodIp - '\n'

    stage 'Deploy'

    sh """
      set +e
      docker rm -f spielplatz-container
      set -e
      docker run -d -p 80:8080 -e DB_IP=$prodIp --name spielplatz-container spielplatz:$BUILD_NUMBER
    """
}

def getIp(String name) {
    sh script: "docker inspect --format '{{ .NetworkSettings.IPAddress }}' $name", returnStdout: true
}