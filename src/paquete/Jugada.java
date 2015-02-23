/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Copete
 */
public class Jugada {
    
    private static final int SIZE = 7;
    private int[][] tablero;
    
    public Jugada(){
        inicializaTablero();
        muestraTablero();
    }
    
    private void inicializaTablero(){
        
        tablero = new int[SIZE][SIZE];
        
        for (int x=0; x<SIZE; x++){
            for (int y=0; y<SIZE; y++){
                tablero[x][y]=0;
                if ((x<2) || (x>4)){
                    if ((y<2) || (y>4))
                        tablero[x][y]=2;
                }
            }
        }
        //Posicion de Enmedio
        tablero[3][3]=1;
    }
    
    private void muestraTablero(){
        for (int x=0; x<SIZE; x++){
            for (int y=0; y<SIZE; y++){
                System.out.print(tablero[x][y] + " ");
            }
            System.out.println();
        }    
    }
    
    
    
    
}
