FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD santhosh2129-1.0-SNAPSHOT.jar santhosh2129.jar
RUN sh -c 'touch /santhosh2129.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /santhosh2129.jar" ]