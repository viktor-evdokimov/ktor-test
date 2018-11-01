# WIP

## About

Simple hello world web server written in kotlin using Jetbrain's ktor web framework

Supports hot reloading and  building fat jar for easy docker deployment

## before you start

```bash

# instal gradle

brew install gradle

```

## To run in docker


```bash

# clone repo
git clone git@github.com:viktor-evdokimov/ktor-test.git

# go to folder

cd ktor-test

# build and build fat jar

gradle shadowJar

# build docker container

docker build -t ktor-test .

#run docker container

docker run -it -p 8080:8080 --rm ktor-test

```

and go to http://localhost:8080 in browser

## To run in dev mode with hot reload

```bash

# clone repo
git clone git@github.com:viktor-evdokimov/ktor-test.git

# go to folder

cd ktor-test

# build and build fat jar

gradle -t build

# open new terminal 

gradle run

```
