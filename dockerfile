FROM tomcat:alpine 
RUN apk add curl --no-cache \ 
    && curl -fsSL -o /usr/local/tomcat/webapps/apDummyApp.war http://192.168.56.101:8081/artifactory/new-snapshots/apDummyApp.war 
CMD ["catalina.sh", "run"]
