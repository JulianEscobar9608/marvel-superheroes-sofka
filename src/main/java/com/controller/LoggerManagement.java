package com.controller;
import org.jboss.logging.Logger;
public class LoggerManagement {
    private final Logger logger = Logger.getLogger(LoggerManagement.class);
    private static LoggerManagement instanceLogger = null;
    public static LoggerManagement getInstance() {
        if (instanceLogger != null) {
            return instanceLogger;
        } else {
            instanceLogger = new LoggerManagement();
        }
        return instanceLogger;
    }
    public void showWelcome(){
        logger.info("------------------------------------------------------------\nBIENVENIDOS A LA APLICACION DE MARVEL\n-----------------------------------------------------------------");
    }
    public void showMenu(){
        logger.info("OPRIMA EL DIGITO PARA VER LA INFORMACION DEL VENGADOR\n1. THOR\n2. CAPITAN AMERICA\n3. IRON MAN \n4. HULK \n5. SPIDER -MAN\n\nPRESIONE 0 PARA SALIR");
    }
    public void showMessage(String message){
        logger.info(message);
    }
    public void showError(String error){
        logger.error(error);
    }

    public void showGoodBye(){
        logger.info("GRACIAS POR TU VISITA...REGRESA PRONTO!");
    }
}
