package com.controller.interfaces;

import okhttp3.Request;

import java.io.IOException;

public interface HttpInterface {

    public Request setRequest(String url);

    public String getResponse(Request peticion) throws IOException;
}
