# Using OpenJDK 11 on Cloud Foundry

## Build with Docker

```
docker run --rm \
           -v ~/.m2:/root/.m2 \
           -v "$PWD":/usr/src \
           -w /usr/src \
           maven:3-jdk-11 \
           mvn clean package
```
