# br-customer-management-new

#Command to clean and prepare .jar file in target folder:
mvn clean install

#Commands to build and run docker:
docker build -t bansodesachin/br-customer-management-new:latest .
docker run -p 8083:8083 bansodesachin/br-customer-management-new:latest


#Commands to Push docker image to docker repository:
docker login
docker push bansodesachin/br-customer-management-new:latest