package _21670310176_ANAS_ALMAQTARI;
import _21670310176_ANAS_ALMAQTARI._21670310176_dosyaOkuma;
import _21670310176_ANAS_ALMAQTARI._21670310176_Dogruluk_tablosuVe_karnaugh;
import java.util.ArrayList;

import java.util.List;
public class _21670310176_BooleanFunction {
	
	static List<Integer> indeks_mi = new ArrayList<Integer>() ;
    static List<Integer> indeks_ma = new ArrayList<Integer>() ;
   // static int Size = _21670310176_dosyaOkuma.Diyagram.length;
	static String[] degiskenler = _21670310176_dosyaOkuma.degiskenler;
	
	static int degiskenler_sayisi = _21670310176_dosyaOkuma.degiskenler.length;
	static int[][] karnaugh_Haritasi_3degiskenli = _21670310176_Dogruluk_tablosuVe_karnaugh.karnaugh_Haritasi_3degiskenli;
	static int[][] karnaugh_Haritasi_4degiskenli = _21670310176_Dogruluk_tablosuVe_karnaugh.karnaugh_Haritasi_4degiskenli;
	//static int control =3;
	static void ifadeler() {
	    System.out.println("fonksiyon ifadeleri:");
	    Mintremler(degiskenler_sayisi);
	    System.out.print("\n");
	    Maxtrimler(degiskenler_sayisi);
	    System.out.print("\n");
	    minterimlerintoplami (degiskenler_sayisi);
	    System.out.print("\n");
	    maxtremlerincarpimi3(degiskenler_sayisi);

	}
   

	static public void Control(int control) {		
	    int[] Diyagram = _21670310176_dosyaOkuma.Diyagram;
           while(control< Diyagram.length) {
        	   switch (Diyagram[control]) {
	            case 0:
	            	indeks_ma.add(control);
	                control ++;
	                break;
	            case 1:
	            	indeks_mi.add(control);
	                control ++;

	                break;
	            default:
	                break;    
        	   }} 
	    }

	

	

	
	
	//----------maxtremlerincarpimi3----------------
	
	static void maxtremlerincarpimi3(int degiskenler_sayisi) {
	    if(degiskenler_sayisi==3) {
	    	System.out.print("F' = ");
	 
	    for (int i = 0; i < indeks_mi.size(); i++) {
	        String s = getMinString(karnaugh_Haritasi_3degiskenli[indeks_mi.get(i)],degiskenler_sayisi);
	        System.out.print("("+s +")");
	        if (i != indeks_mi.size() - 1) {
	            System.out.print(".");
	        }
	    }   }else if(degiskenler_sayisi==4) {
	    	System.out.print("F' =");
			for(int i = 0 ; i< indeks_mi.size() ; i++) {
				   for(int j = 0 ; j< karnaugh_Haritasi_4degiskenli[indeks_mi.get(i)].length ; j++) {
					   String s = getMinString(karnaugh_Haritasi_4degiskenli[indeks_mi.get(i)],degiskenler_sayisi);
				        System.out.print("("+s+")");
				        if (i != indeks_mi.size() - 1) {
				            System.out.print(".");
				        }
				    } 
	   
				   }}
	    }
	

	static String getMinString(int[] arr,int degiskenler_sayisi) {
	   if(degiskenler_sayisi ==3) {
		   StringBuilder sb = new StringBuilder();
	  
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == 1) {
	            sb.append(degiskenler[i]).append("'");
	        } else if (arr[i] == 0) {
	            sb.append(degiskenler[i]);
	        }
	        if (i != arr.length - 1) {
	            sb.append("+");
	        }
	    }
	    return sb.toString();
	}else if(degiskenler_sayisi ==4) {
		   StringBuilder sb = new StringBuilder();
			  
		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] == 1) {
		            sb.append(degiskenler[i]).append("'");
		        } else if (arr[i] == 0) {
		            sb.append(degiskenler[i]);
		        }
		        if (i != arr.length - 1) {
		            sb.append("+");
		        }
		    }
		    return sb.toString();
}
		
		
	
	return null; }	
	/*static String getMinString(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
        switch (arr[i]) {
            case 1:
                sb.append(var[i]).append("'");
                break;
            case 0:
                sb.append(var[i]);
                break;
        }
        if (i != arr.length - 1) {
            sb.append(" + ");
        }
    }
    return sb.toString();
}*/
	
	
	
	
	
	//-----------------Maxtrimler-------------------
	
	static void Maxtrimler(int degiskenler_sayisi) {
	    if(degiskenler_sayisi==3) {
	    	System.out.print("F = ");
	    
	    for(int i = 0 ; i< indeks_ma.size() ; i++) {
	        System.out.print(getMaxterm(i,degiskenler_sayisi));
	        if(i != indeks_ma.size() - 1) {
	            System.out.print(".");
	        }}
	    }else if(degiskenler_sayisi==4) {
	    	System.out.print("F = ");
		    for(int i = 0 ; i< indeks_ma.size() ; i++) {		    	
		        System.out.print(getMaxterm(i,degiskenler_sayisi));
		        if(i != indeks_ma.size() - 1) {
		            System.out.print(".");
		        }}}
	}

	static String getMaxterm(int index,int degiskenler_sayisi) {
	    if (degiskenler_sayisi==3) {
	    	StringBuilder sb = new StringBuilder();	 
	    sb.append("(");
	    for(int j = 0 ; j < karnaugh_Haritasi_3degiskenli[indeks_ma.get(index)].length ; j++) {
	        switch(karnaugh_Haritasi_3degiskenli[indeks_ma.get(index)][j]) {
	            case 1:
	                sb.append(degiskenler[j]).append("'");
	                break;
	            case 0:
	                sb.append(degiskenler[j]).append(" ");
	                break;
	            default:
	                break;
	        }
	        if(j != indeks_ma.size() - 2) {
	            sb.append(" + ");
	        }
	    } 
	    sb.append(")");
	    return sb.toString();
	    
	}
	    else if(degiskenler_sayisi==4) {	
	    	StringBuilder sb = new StringBuilder(); 
	    	sb.append("(");
	        for (int j = 0; j < degiskenler_sayisi; j++) {
	            if (j != 0) {
	                sb.append("+");
	            }
	            switch (degiskenler_sayisi) {
	                case 3:
	                    sb.append(karnaugh_Haritasi_3degiskenli[indeks_ma.get(index)][j] == 1 ? degiskenler[j] + "'" : degiskenler[j]);
	                    break;
	                case 4:
	                    sb.append(karnaugh_Haritasi_4degiskenli[indeks_ma.get(index)][j] == 1 ? degiskenler[j] + "'" : degiskenler[j]);
	                    break;
	                default:
	                    break;
	            }
	        }
	        sb.append(")");
	        return sb.toString();
	    }
	
	    	
		return null;
	    }
	
	
	
	
	
	
	
	
	//--------------minterimlerintoplami------------
	
	static void minterimlerintoplami(int degiskenler_sayisi) {
	    if(degiskenler_sayisi==3) {
	    	System.out.print("F' =");
	 
	    for (int i = 0; i < indeks_ma.size(); i++) {
	        int[] maxterm = karnaugh_Haritasi_3degiskenli[indeks_ma.get(i)];
	        for (int j = 0; j < maxterm.length; j++) {
	            String term = maxterm[j] == 0 ? degiskenler[j] + "'" : degiskenler[j];
	            System.out.print( term);
	        }
	        if (i != indeks_ma.size() - 1) {
	            System.out.print(" +");
	        }
	    }   }else if(degiskenler_sayisi==4){
	    	System.out.print("F' =");
			for(int i = 0 ; i< indeks_ma.size() ; i++) {	
		        int[] maxterm = karnaugh_Haritasi_4degiskenli[indeks_ma.get(i)];
				   for(int j = 0 ; j< maxterm.length ; j++) {					   
					     String term = maxterm[j] == 0 ? degiskenler[j] + "'" : degiskenler[j];
				            System.out.print( term);
				            /*   if(karnaugh_Haritasi_4degiskenli[IndexOfMax.get(i)][j] == 0 ) {						  
						   System.out.print(" " + degiskenler[j] +"'" );						
					   }
					   if(karnaugh_Haritasi_4degiskenli[IndexOfMax.get(i)][j] ==  1 ) {
						   System.out.print(" " +  degiskenler[j] + " " );
					   }					 
				   }*/
				        }
				   if(i != indeks_ma.size()-1) {
					   System.out.print( "+");
				   }
				  
			   }
	    }
	}
	
	//-------------------Mintremler------------------ 

	static void Mintremler(int degiskenler_sayisi) {
	    if(degiskenler_sayisi==3) {
	    	System.out.print("F =");
	    
	    for (int i = 0; i < indeks_mi.size(); i++) {
	        printMinterm(karnaugh_Haritasi_3degiskenli[indeks_mi.get(i)], degiskenler);
	        if (i != indeks_mi.size() - 1) {
	            System.out.print("+");
	        }
	    }}else if (degiskenler_sayisi==4) {
	    	System.out.print("F = ");
		    
		    for (int i = 0; i < indeks_mi.size(); i++) {
		        printMinterm(karnaugh_Haritasi_4degiskenli[indeks_mi.get(i)], degiskenler);
		        if (i != indeks_mi.size() - 1) {
		            System.out.print(" + ");
		        }
		    }}}
	private static void printMinterm(int[] minterm, String[] degiskenler) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < degiskenler.length; i++) {
	        if (minterm[i] == 0) {
	            sb.append(degiskenler[i]).append("'");
	        } else if (minterm[i] == 1) {
	            sb.append(degiskenler[i]);
	        }
	    }
	    System.out.print(sb.toString());
	}	
	}




	
	
