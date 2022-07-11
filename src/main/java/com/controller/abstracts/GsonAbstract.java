package com.controller.abstracts;
import com.google.gson.*;

public abstract class GsonAbstract {

    protected final Gson GSON = new Gson();

    public abstract void setNewObject(String json);



}
