package com.controller.abstracts;
import java.io.IOException;
import java.util.Properties;

public abstract class MyPropertiesAbstract {

    protected final Properties PROPERTIES = new Properties();

    public abstract void readProperties() throws IOException;
    public abstract String obtenerProperty(String key) throws RuntimeException;
}
