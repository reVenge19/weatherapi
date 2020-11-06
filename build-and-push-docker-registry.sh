#!/bin/bash

DOCKER_ACC="revenge19"
DOCKER_REPO="weather-api"
IMG_TAG="latest"

mvn clean install
docker build -t "$DOCKER_ACC/$DOCKER_REPO:$IMG_TAG" .
docker push "$DOCKER_ACC/$DOCKER_REPO:$IMG_TAG"

