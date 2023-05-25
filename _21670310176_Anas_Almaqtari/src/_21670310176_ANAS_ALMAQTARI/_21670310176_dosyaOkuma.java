package _21670310176_ANAS_ALMAQTARI;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.ArrayList;
import java.util.Scanner; 
import java.math.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class _21670310176_dosyaOkuma {
       static  Scanner scanner;
		  static String Okunan_dosya_adi =null;
		  public static String []degiskenler;
			  public static String str[] ; 
			  public static int [] Diyagram ;
			  public  static void dosyaAcmaVeOkuma() throws FileNotFoundException{				 	  
				  File Okunan_dosya = new File("karnaugh.txt");
			      Scanner scanner = new Scanner(Okunan_dosya);
			      scanner.hasNextLine() ;
			      String data = scanner.nextLine();
             str = data.split(":");
			      degiskenler = str[1].split(",");	 
			     
			      for (int i = 0; i < degiskenler.length; i++) {
			    	  degiskenler[i] = degiskenler[i].trim();
					}
	      
			      data = scanner.nextLine() ;
			      Diyagram = new int[1 << degiskenler.length];
			      if (Diyagram.length == 8) {
			    	    for (int i = 0; i < 8; i++) {
			    	        int index;
			    	        switch (i) {
			    	            case 0:
			    	                index = 0;
			    	                break;
			    	            case 1:
			    	                index = 1;
			    	                break;
			    	            case 2:
			    	                index = 3;
			    	                break;
			    	            case 3:
			    	                index = 2;
			    	                break;
			    	            case 4:
			    	                index = 4;
			    	                break;
			    	            case 5:
			    	                index = 5;
			    	                break;
			    	            case 6:
			    	                index = 7;
			    	                break;
			    	            default:
			    	                index = 6;
			    	        }
			    	        Diyagram[index] = scanner.nextInt();
			    	    }
			    	}
			      if (Diyagram.length == 16) {
			    	    for (int i = 0; i < 8; i++) {
			    	        int index;
			    	        if (i == 0) {
			    	            index = 0;
			    	        } else if (i == 1) {
			    	            index = 1;
			    	        } else if (i == 2) {
			    	            index = 3;
			    	        } else if (i == 3) {
			    	            index = 2;
			    	        } else if (i == 4) {
			    	            index = 4;
			    	        } else if (i == 5) {
			    	            index = 5;
			    	        } else if (i == 6) {
			    	            index = 7;
			    	        } else if(i==7){
			    	            index = 6;
			    	        }  else if(i==8){
			    	            index = 8;
			    	        } 
			    	        else if(i==9){
			    	            index = 9;
			    	        }  else if(i==10){
			    	            index = 11;
			    	        }else if(i==11){
			    	            index = 10;
			    	        }   else if(i==12){
			    	            index = 12;
			    	        } else if(i==13){
			    	            index = 13;
			    	        } else if(i==14){
			    	            index = 15;
			    	        } else {
			    	            index = 14;
			    	        }
			    	        Diyagram[index] = scanner.nextInt();
			    	    }
			    	}          
			      
			      Okunan_dosya_adi = Okunan_dosya.getName();
			      System.out.println(Okunan_dosya_adi +" dosyası okundu.");
		    	  scanner.close();

			  }			  
			  
			

}