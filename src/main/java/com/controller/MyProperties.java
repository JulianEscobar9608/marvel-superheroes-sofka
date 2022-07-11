package com.controller;
import com.controller.abstracts.MyPropertiesAbstract;
import com.controller.ownexception.MarvelHeroresException;
import java.io.FileInputStream;
import java.io.IOException;

public class MyProperties extends MyPropertiesAbstract {
    private final FileInputStream archivEntrada;
    public MyProperties(String ruta) {
        try {
            archivEntrada = new FileInputStream(ruta);
            readProperties();
        } catch (IOException e) {
            throw new MarvelHeroresException(e.getMessage());
        }
    }
    @Override
    public void readProperties() throws IOException {
        PROPERTIES.load(archivEntrada);
    }

    @Override
    public String obtenerProperty(String key) throws RuntimeException{
        return PROPERTIES.getProperty(key);
    }


}
