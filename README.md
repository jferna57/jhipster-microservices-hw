## Synopsis

Proof of Concept about Jhipster and microservices.

This code is based on this tutorial http://stytex.de/blog/2016/03/25/jhipster3-microservice-tutorial/


## Jhipster and microservices

In the diagram below, the green components are specific to your application and the blue components provide its underlying infrastructure.

![microservices architecture](https://jhipster.github.io/images/microservices_architecture_2.png)

## Installation.


### 1. Jhipster docker Installation.

``` bash
docker pull jhipster/jhipster
```

### 2. Basic microservice setup

``` bash
$ mkdir foobar
$ cd foobar
$ mkdir foo-service bar-service gateway docker
```
### 3. Create the FooService and BarService

``` bash
cd foo-service
yo jhipster
```
![Jhipster foo-service](https://dl.dropboxusercontent.com/u/945696/jhipster-microservices-poc/foo-service.jpg)

``` bash
yo jhipster:entity Foo
```

![Jhipster foo-service Foo Entity](https://dl.dropboxusercontent.com/u/945696/jhipster-microservices-poc/foo-service-Entity-Foo.jpg)

``` bash
cd ..
cd bar-service
yo jhipster
```
![Jhipster bar-service](https://dl.dropboxusercontent.com/u/945696/jhipster-microservices-poc/bar-service.jpg)

``` bash
yo jhipster:entity Foo
```

![Jhipster foo-service Foo Entity](https://dl.dropboxusercontent.com/u/945696/jhipster-microservices-poc/bar-service-Entity-Bar.jpg)

### 4. Create the docker images

The gradle command will fetch all the fancy dependencies for spring and finally generates a docker image, which will be saved to our local image registry.

__IMPORTANT !!! This command can not be done inside docker.__

``` bash
cd ..
cd foo-service
./gradlew build -Pprod buildDocker
cd ..
cd bar-service
./gradlew build -Pprod buildDocker
```
### 5. Generate the gateway

``` bash
cd ..
cd gateway
yo jhipster
```
![gateway](https://dl.dropboxusercontent.com/u/945696/jhipster-microservices-poc/gateway.jpg)

### 6. Import the generated Entities (Foo and Bar) and generate gateway docker image

``` bash
yo jhipster:entity Foo
yo jhipster:entity Bar
./gradlew build -Pprod -x test buildDocker
```

### 7. Generate docker compose

``` bash
cd ..
yo jhipster:docker-compose
```

![Docker-compose](https://dl.dropboxusercontent.com/u/945696/jhipster-microservices-poc/docker-compose.jpg)

### 8. Start the cloud using docker-compose

__IMPORTANT: Remember to stop docker jhipster image.__

``` bash
docker-compose up -d
```
On this image you can see all the docker containers started.

![docker ps output](https://dl.dropboxusercontent.com/u/945696/jhipster-microservices-poc/docker-ps-command.jpg)
