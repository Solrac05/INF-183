/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf183;

/**
 *
 * @author Student
 */
public class INF183 {

    public static double Power (double x, int y) {
        int total =1;
        for (int i=1; i<= y; i++){
         total*=x;   
        }
        return total;
    }
    public static void main(String[] args) {
           int temp =(int) Power(4,3);
           System.out.println(temp);
       
    }
    
    
}
