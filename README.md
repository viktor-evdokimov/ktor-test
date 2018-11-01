# WIP

## About

Simple hello world web server written in kotlin using Jetbrain's ktor web framework

Supports hot reloading and  building fat jar for easy docker deployment


## To run in docker


```bash

# clone repo
git clone git@github.com:viktor-evdokimov/ktor-test.git

# go to folder

cd ktor-test

# build and build fat jar

./gradlew shadowJar

# build docker container

docker build .

#run docker container with sha returned from last step

docker run -it -p 8080:8080 <sha>

```

## To run in dev mode with hot reload

```bash

# clone repo
git clone git@github.com:viktor-evdokimov/ktor-test.git

# go to folder

cd ktor-test

# build and build fat jar

./gradlew -t build

# open new terminal 

./gradlew run

```
