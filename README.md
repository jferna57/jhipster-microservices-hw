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



$ mkdir foobar
$ cd foobar
$ mkdir foo-service bar-service gateway docker
