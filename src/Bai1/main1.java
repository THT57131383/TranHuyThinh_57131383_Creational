/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author TranHuyThinh
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon Bill = new HoaDon.Builder()
                        .addHeader("HD1")
                        .addCTDH("CT1")
                        .addCTDH("CT2")
                        .addCTDH("CT3")
                        .build();
        
        System.out.println(Bill.toString());
    }
    
}
