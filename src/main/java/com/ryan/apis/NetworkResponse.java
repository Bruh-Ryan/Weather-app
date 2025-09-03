package com.ryan.apis;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import io.github.cdimascio.dotenv.Dotenv;

public class NetworkResponse {
    private final Dotenv dotenv = Dotenv.configure()
                                    .directory("src/main/java/com/ryan/apis")
                                    .filename(".env") // custom file name
                                    .load();
    private final String API_KEY = dotenv.get("API_KEY");
    private final String BASE_URL = dotenv.get("BASE_URL");
    private HttpClient client;
    private HttpRequest request;
    private String default_city="london";
    

    public Integer getResponse(String default_city) {
        try {
            client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .connectTimeout(Duration.ofSeconds(30))
                    .build();

            // Build request with city + API_KEY
            request = HttpRequest.newBuilder()
                                            .uri(URI.create(BASE_URL + "?q=+" + default_city + "&appid=" + API_KEY + "&units=metric"))
                                            .GET()
                                            .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
           return response.statusCode();
            
        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }
    public String getCityWeather(String default_city) {
        try {
            client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .followRedirects(HttpClient.Redirect.NORMAL)
                    .connectTimeout(Duration.ofSeconds(30)).build();
        request = HttpRequest.newBuilder()
                             .uri(URI.create(BASE_URL+"?q=+" + default_city + "&appid=" + API_KEY + "&units=metric"))
                             .GET().build();
        HttpResponse<String> cityResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            return cityResponse.body();
        } catch (Exception e) {
            return "invalid";
        }
            
    }
}