#!/bin/bash
mvn clean install
docker build -t "revenge19/weather-api:latest" .
docker push "revenge19/weather-api:latest"

