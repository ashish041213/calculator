FROM tomcat:alpine
ADD **/apDummyApp.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
