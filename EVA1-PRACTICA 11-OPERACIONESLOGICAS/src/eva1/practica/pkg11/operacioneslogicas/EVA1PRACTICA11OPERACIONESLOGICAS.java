/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1.practica.pkg11.operacioneslogicas;

/**
 *
 * @author alond
 */
public class EVA1PRACTICA11OPERACIONESLOGICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int radio = 5;  //DECLARAMOS E INICIALIZAMOS
       boolean resu; 
       //OPERACIONES LOGICAS; COMPARACIONES
       //RESULTADOS: VERDADERO O FALSO
       resu = radio > 0; //RADIO ES MAYOR QUE CERO?
       System.out.println("radio (5) > 0 -->");
       System.out.println(resu);
       
       resu = radio < 0; //RADIO MENOR QUE CERO?
       System.out.println("radio (5) < 0 -->");
       System.out.println(resu);
       
       
    }
    
}
