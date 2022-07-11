package com.controller;

import com.controller.ownexception.MarvelHeroresException;

import java.util.Scanner;

public class ScannerManagement {
    protected static final Scanner entrada = new Scanner(System.in);

    private static ScannerManagement instanciaScanner = null;

    public static ScannerManagement getInstanciaScanner(){
        if(instanciaScanner != null){
            return instanciaScanner;
        }
        instanciaScanner = new ScannerManagement();
        return instanciaScanner;
    }

    public Integer getInteger() throws MarvelHeroresException {
        return Integer.parseInt(entrada.nextLine());
    }

    public void cerrar(){
        entrada.close();
    }
}
