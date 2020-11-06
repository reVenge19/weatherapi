# WeatherApi

WeatherApi is my way of solving the task LTS gave me for my job application and it is an application that will return you a JSON using the [OpenWeather](https://openweathermap.org/) API.

## Downloading and running WeatherApi with docker

For installing you can simply follow the next steps:  
Open terminal and do a `docker run -p 127.0.0.1:8080:8080/tcp revenge19/weather-api`  
This will download the docker image, run it and host the program on localchost:8080 (-p parameter is for exposing to a port)

## Accesing the software on GCP
You can just access the deployed software at [Google Cloud Platform](http://35.226.196.105:8080/weather/barcelona).
I used *Kubernetes* for the deployment on GCP.

## Cloning repository and running it locally
The repository is public so you can download it and try it.

## Usage
For using it just open a terminal and do a curl with your desired city:

eg:
```shell script
curl https://localhost:8080/weather/Barcelona
```
This will return a JSON with the temperature and a brief description of what's the weather like on your desired city/country.  
```json
{
"condition": "broken clouds",
"temp": "16,95"
}
```
*You can simply use your browser with localhost:8080/weather/{yourcity}.*

## Resources recap

- [Docker Container](https://hub.docker.com/repository/docker/revenge19/weather-api)
- [GCP](http://35.226.196.105:8080/weather/barcelona)
- [Swagger (OpenAPI3 Doc)](https://app.swaggerhub.com/apis/reVenge19/WeatherApi/0.1)
- [Github](https://github.com/reVenge19/weatherapi)
