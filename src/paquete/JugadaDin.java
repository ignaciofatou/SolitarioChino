/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.Rectangle;
import javax.swing.JButton;

/**
 *
 * @author Copete
 */
public class JugadaDin extends javax.swing.JPanel{
    
    private static final int LARGUE     = 7;
    private static final int SIZE_BTN   = 30;
    private static final int MARGIN_BTN = 10;
    
    private JButton[][] tablero;
    
    public JugadaDin(){
        this.setLayout(null);
        this.setBounds(getPanelBounds());
        inicializaTablero();
    }
    
    private void inicializaTablero(){
        
        tablero = new JButton[LARGUE][LARGUE];
        
        for (int x=0; x<LARGUE; x++){
            for (int y=0; y<LARGUE; y++){
                //Posicionamos Botones en el Panel
                tablero[x][y] = new JButton();
                tablero[x][y].setBounds(getButtonBounds(x, y));
                tablero[x][y].setVisible(true);
                this.add(tablero[x][y]);
                //if ((x<2) || (x>4)){
                //    if ((y<2) || (y>4))
                //        tablero[x][y].setBounds(x, y, y, y);
                //}
            }
        }
        //Posicion de Enmedio
        //tablero[3][3].setBounds(2, 2, 2, 2);
    }
    
    private Rectangle getButtonBounds(int x, int y){
        Rectangle cuadrado = new Rectangle();
        int posX = x * (SIZE_BTN + MARGIN_BTN);
        int posY = y * (SIZE_BTN + MARGIN_BTN);
        cuadrado.setBounds(posX, posY, SIZE_BTN, SIZE_BTN);
        return cuadrado;
    }
    
    private Rectangle getPanelBounds(){
        Rectangle cuadrado = new Rectangle();
        int posX = MARGIN_BTN;
        int posY = MARGIN_BTN;
        int size = MARGIN_BTN + LARGUE * (SIZE_BTN + MARGIN_BTN);
        cuadrado.setBounds(posX, posY, size, size);
        return cuadrado;
    }
    
    
    
    
}
