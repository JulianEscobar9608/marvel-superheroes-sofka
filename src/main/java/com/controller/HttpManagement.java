package com.controller;
import com.controller.interfaces.HttpInterface;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
public class HttpManagement implements HttpInterface {
    private final OkHttpClient client = new OkHttpClient();
    private static HttpManagement instance = null;
    public static HttpManagement getInstance(){
        if(instance != null){
            return instance;
        }
        instance = new HttpManagement();
        return instance;
    }
    @Override
    public Request setRequest(String url) {
        return  new Request.Builder()
                .url(url)
                .build();
    }
    @Override
    public String getResponse(Request peticion) throws IOException {
        try (Response response = client.newCall(peticion).execute()) {
            assert response.body() != null;
            return response.body().string();
        }
    }
}
