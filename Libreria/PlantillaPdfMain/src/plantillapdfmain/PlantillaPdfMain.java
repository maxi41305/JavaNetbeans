/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantillapdfmain;

/**
 *
 * @author Navi
 */
public class PlantillaPdfMain {

    public static void main(String[] args) {
        Plantilla miPlantilla = new Plantilla(
                "Carlos",
                "Cualquier apellido",
                "23/04/2021",
                "C:\\Users\\Navi\\Pictures\\logooooo.png");
        miPlantilla.crearPlantilla();
    }
    
}
