# WeatherApi

WeatherApi is my way of solving the task LTS gave me for my job application and it is an application that will return you a JSON using the [OpenWeather](https://openweathermap.org/) API.
## Downloading and running WeatherApi with docker

For installing you can simply follow the next steps:
Open terminal and do a `docker run -p 127.0.0.1:8080:8080/tcp revenge19/weather-api`  
This will download the docker image, run it and host the program on localchost:8080 (-p parameter is for exposing to a port)

## TODO: GCP

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

