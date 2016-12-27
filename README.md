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
