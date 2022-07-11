package com.controller;
import com.controller.abstracts.GsonAbstract;
import com.model.Hero;
import java.util.ArrayList;
import java.util.List;
public class DeserializationManagement extends GsonAbstract {

    private List<Hero> heroes;
    private static DeserializationManagement instanceDeserializationManagement;

    DeserializationManagement(){ heroes = new ArrayList<>();}

    public List<Hero> getHeroes() {
        return heroes;
    }

    public static DeserializationManagement getInstanceDeserializationManagement(){
        if(instanceDeserializationManagement != null){
            return instanceDeserializationManagement;
        }
        instanceDeserializationManagement = new DeserializationManagement();
        return instanceDeserializationManagement;
    }
    @Override
    public void setNewObject(String json) {
        heroes.add(GSON.fromJson(json, Hero.class));
    }

}
