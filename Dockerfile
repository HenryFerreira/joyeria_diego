FROM amazoncorretto:17-alpine-jdk
MAINTAINER Haff
COPY out/artifacts/joyeria_api_main_jar/joyeria_api.main.jar  joyeria_api.jar
ENTRYPOINT ["java", "-jar", "/joyeria_api.jar"]