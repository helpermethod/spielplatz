FROM anapsix/alpine-java:jdk

RUN apk update && apk add curl unzip && curl -o /mem.zip -L https://github.com/membrane/service-proxy/releases/download/v4.2.2/membrane-service-proxy-4.2.2.zip \
    && mkdir -p /app && cd /app && unzip /mem.zip && rm /mem.zip && ln -s membrane-service-proxy-* membrane

RUN rm /app/membrane/lib/service-proxy-core*
ADD proxies.xml /app/membrane/conf
ADD service*.jar /app/membrane/lib
WORKDIR /app/membrane

CMD /bin/bash -c './service-proxy.sh'