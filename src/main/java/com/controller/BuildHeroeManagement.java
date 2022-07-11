package com.controller;
import com.controller.ownexception.MarvelHeroresException;
import java.io.IOException;
public class BuildHeroeManagement {
    private final MyProperties propiedad = new MyProperties("src/main/resources/archivo.properties");
    private final HttpManagement gestorHttp = HttpManagement.getInstance();
    private final DeserializationManagement deserializador = DeserializationManagement.getInstanceDeserializationManagement();
    private static BuildHeroeManagement gestionInstancia = null;

    BuildHeroeManagement(){
        setHeroes();
    }
    public DeserializationManagement getDeserializador() {
        return deserializador;
    }
    public static BuildHeroeManagement getInstanciaBuildHeroe(){
        if(gestionInstancia != null){
            return gestionInstancia;
        }
        gestionInstancia = new BuildHeroeManagement();
        return gestionInstancia;
    }
    public String getHeroeFromWeb(String name){
        try {
            return gestorHttp.getResponse(gestorHttp.setRequest(String.format(propiedad.obtenerProperty("mainPath"),name)));
        } catch (IOException e) {
            throw new MarvelHeroresException(e.getMessage());
        }
    }
    private void setHeroes(){
        String [] heroes = propiedad.obtenerProperty("heroesNameArray")
                                    .split(",");
        for (String hero : heroes) {
            deserializador.setNewObject(getHeroeFromWeb(hero));
        }
    }

}
