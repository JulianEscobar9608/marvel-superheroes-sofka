package com;
import com.controller.BuildHeroeManagement;
import com.controller.LoggerManagement;
import com.controller.ScannerManagement;
import com.model.Hero;

public class App {
    static BuildHeroeManagement instanciaConstructor = BuildHeroeManagement.getInstanciaBuildHeroe();
    static LoggerManagement logger = LoggerManagement.getInstance();
    static ScannerManagement scanner = ScannerManagement.getInstanciaScanner();

    public static void main(String[] args) {
        init();
    }
    private static void init(){
        Integer seleccion = 0;
        logger.showWelcome();
        do{
            try{
                logger.showMenu();
                seleccion = scanner.getInteger()-1;
                Hero heroe = instanciaConstructor.getDeserializador()
                        .getHeroes()
                        .get(seleccion);
                logger.showMessage(heroe.toString());
            }catch (Exception e){
                if(seleccion != -1) logger.showError("Debe digitar un caracter valido");
            }
        }while(seleccion != -1 );
        scanner.cerrar();
        logger.showGoodBye();
    }
}

