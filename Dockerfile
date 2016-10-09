FROM java:8
COPY /build/libs/ /opt/app
COPY /config /opt/app/config
WORKDIR /opt/app
CMD ["java","-jar","profiles-application-1.0-SNAPSHOT.jar"]



