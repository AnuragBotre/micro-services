FROM openjdk@sha256:2d17e02b6902d28c8546b2a1feff7e4a1fd74c703339bca6ae1c45584b9a0b67

ENV MONGO_INITDB_ROOT_USERNAME=admin \
    MONGO_INITDB_ROOT_PASSWORD=password

RUN mkdir -p /home/app

COPY ./mongodb-application/target/mongodb-application-1.0-SNAPSHOT.jar /home/app

CMD ["java","-jar","/home/app/mongodb-application-1.0-SNAPSHOT.jar","--spring.data.mongodb.username=${MONGO_INITDB_ROOT_USERNAME} --spring.data.mongodb.password=${MONGO_INITDB_ROOT_PASSWORD} "]