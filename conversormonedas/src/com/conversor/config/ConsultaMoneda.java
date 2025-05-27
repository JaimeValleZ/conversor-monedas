package com.conversor.config;

import com.conversor.modelo.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda ConsultaMoneda(String base_code, String target_code, double amount){

        String apiKey = "ca3f0517b9d6cff43fc499ea";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" +apiKey + "/pair/" + base_code + "/" + target_code +"/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void exhibirMenu(){

        System.out.println("""
                ************************************************
                Sea bienvenido/a al Conversor de Moneda 
                
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Salir
                Elija una opcion valida:
                *************************************************
                """);
    }


}
