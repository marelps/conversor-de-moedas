package org.example.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Client {

    private final String AUTHORIZATION;
    private final String TOKEN;
    private final String URL;

    public Client() {
        AUTHORIZATION = "Authorization";
        TOKEN = "Bearer ab14fbdea52e725dc782afab";
        URL = "https://v6.exchangerate-api.com/v6/latest/";
    }

    public HttpClient connect() {
        return HttpClient.newHttpClient();
    }

    public HttpRequest request(String coin) {
        return HttpRequest.newBuilder()
                .uri(URI.create(URL + coin))
                .header(AUTHORIZATION, TOKEN)
                .build();
    }

    public HttpResponse<String> response(HttpClient connect, HttpRequest request) throws IOException, InterruptedException {
         return connect.send(request, BodyHandlers.ofString());
    }
}
