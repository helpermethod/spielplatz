set +e
docker rm -f postgres-spielplatz-prod
set -e
docker run \
  --name postgres-spielplatz-prod \
  -e POSTGRES_PASSWORD=spielplatz \
  -e POSTGRES_USER=spielplatz \
  -e POSTGRES_DB=spielplatz \
  -d \
  postgres:9.6.0
