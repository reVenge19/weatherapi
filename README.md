# WeatherApiResponse

WeatherApiResponse is my solution to the task given by LTS for my job application. It uses the JSON [OpenWeather](https://openweathermap.org/) provides to give the desired output.
## Installation

:todo instalation process

## Usage
After having downloaded the [docker container](https://hub.docker.com/r/revenge19/weather-api) and have the application running, you only need to use the following command on your terminal.
```shell script
curl https://localhost:8080/weather/Barcelona
```
This will return a JSON with the temperature and a brief description of what's the weather like on your desired city/country.  
e.g:
```json
{
"condition": "broken clouds",
"temp": "16,95"
}
```

