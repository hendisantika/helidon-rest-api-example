# helidon-rest-api-example

Helidon MP application that uses the dbclient API with MySQL database.

## Build and run

This example requires a MySQL database, start it using docker:

```
docker run --rm --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=53cret -e MYSQL_DATABASE=pokemon -e MYSQL_USER=yu71 -e MYSQL_PASSWORD=53cret  mysql:9.2.0
```

With JDK17+

```bash
mvn package
java -jar target/helidon-rest-api-example-1.0.jar
```

## Exercise the application

```
curl -X GET http://localhost:8080/simple-greet
{"message":"Hello World!"}
```

## Try metrics

```
# Prometheus Format
curl -s -X GET http://localhost:8080/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET http://localhost:8080/metrics
{"base":...
. . .
```

## Try health

```
curl -s -X GET http://localhost:8080/health
{"outcome":"UP",...

```

## Building the Docker Image

```
docker build -t helidon-rest-api-example .
```

## Running the Docker Image

```
docker run --rm -p 8080:8080 helidon-rest-api-example:latest
```

Exercise the application as described above.
