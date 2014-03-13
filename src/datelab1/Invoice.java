/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datelab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jkemper3
 */
public class Invoice {

     private Calendar  invoiceDate;
     private int gracePeriod = 15;
     //private  Calendar dueDate;
     Date dueDate = new Date();
    

    public Invoice(Calendar dueDate) {
        this.invoiceDate = Calendar.getInstance();
    }

    public final Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public final void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public Date getDueDate() {
        
        invoiceDate.add(Calendar.DATE,gracePeriod);
        
        dueDate = invoiceDate.getTime();
        
       
        return dueDate;
    }
    
    public String getDueDateAsString(){
    String format = "MM/dd/yyyy hh:mm a";
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    
     String formattedDate = sdf.format(dueDate);
     
     return formattedDate;
    
    }
    
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

   
     
     
    }
    