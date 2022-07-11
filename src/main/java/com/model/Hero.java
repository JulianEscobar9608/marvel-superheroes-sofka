package com.model;

public class Hero {
    private Data data;

    public Hero(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String sentence = "============MARVEL HEROE============\n";
        for (Results res : data.getResults()){
            sentence += "ID: "+res.getId()+"\nNOMBRE: "+res.getName()+"\nDESCRIPCION: "+res.getDescription()+"\nIMAGEN: "+res.getThumbnail().toString();
        }
        return sentence;
    }
}
