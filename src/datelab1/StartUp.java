/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datelab1;

import java.util.Calendar;

/**
 *
 * @author jkemper3
 */
public class StartUp {
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        Invoice i = new Invoice(c);
        
        i.getDueDateAsString();
        i.getDueDate();
        
        System.out.println(i.getDueDateAsString());
        System.out.println(i.getDueDate());
}
}