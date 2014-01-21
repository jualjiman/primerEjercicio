/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejercicio;

/**
 *
 * @author Idea
 */
public class PrimerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int recibir = suma(2,4);
        System.out.println(recibir);
    }
    
    public static int suma(int n1,int n2){
        int resultado;
        resultado = n1 + n2;
        return resultado;
    }
}
