package org.example.helper;

import com.google.gson.Gson;
import org.example.http.ApiResponse;
import org.example.http.Client;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConversionRateHelper {
    public static double getRateValue(String coinIn, String coinOut) {
        double value = 0;
        Client client = new Client();
        Gson gson = new Gson();

        try {
            HttpResponse<String> response = client.response(client.connect(), client.request(coinIn));
            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);
            Map<String, Double> conversationRates = apiResponse.getConversionRates();
            value = conversationRates.get(coinOut);
        } catch (IOException | InterruptedException e) {
            e.fillInStackTrace();
        }

        return value;
    }

    public static double processValueInByUser(double valueByUser, double valueByConversionRate) {
        return valueByUser * valueByConversionRate;
    }
}
