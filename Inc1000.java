/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000;

/**
 *
 * @author iannone.stefano
 */
public class Inc1000 extends Thread{
    static int cont;
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            inc1();
            
        }
    }
    
    synchronized void inc1() {
        cont++;
    }
}
