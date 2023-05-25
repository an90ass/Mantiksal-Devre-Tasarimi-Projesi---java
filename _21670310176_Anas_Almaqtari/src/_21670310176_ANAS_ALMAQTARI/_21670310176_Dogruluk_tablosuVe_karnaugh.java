package _21670310176_ANAS_ALMAQTARI;
import _21670310176_ANAS_ALMAQTARI._21670310176_dosyaOkuma;
public class _21670310176_Dogruluk_tablosuVe_karnaugh {
	
	static int[] output = _21670310176_dosyaOkuma.Diyagram;
    static  String[] input = _21670310176_dosyaOkuma.degiskenler;
  
    	  static int[][] karnaugh_Haritasi_3degiskenli = new int[][] {
            new int[] {0, 0, 0},
            new int[] {0, 0, 1},
            new int[] {0, 1, 0},
            new int[] {0, 1, 1},
            new int[] {1, 0, 0},
            new int[] {1, 0, 1},
            new int[] {1, 1, 0},
            new int[] {1, 1, 1}
        };
        static int[][] karnaugh_Haritasi_4degiskenli = new int[][] {
            {0, 0, 0, 0}, {0, 0, 0, 1}, {0, 0, 1, 0}, {0, 0, 1, 1},
            {0, 1, 0, 0}, {0, 1, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1},
            {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 0, 1, 0}, {1, 0, 1, 1},
            {1, 1, 0, 0}, {1, 1, 0, 1}, {1, 1, 1, 0}, {1, 1, 1, 1}
        };
  
  
    public static void dogruluk_tablosu(int degiskenler_sayisi) {
        
        int sayac = 0;
        for (int i = 0; i < input.length; i++) {
            System.out.print(" "+input[i]+"");
        }
        System.out.println(" F");
        int dogruluk_tab_durma_noktasi3 = karnaugh_Haritasi_3degiskenli.length;
        int dogruluk_tab_durma_noktasi4 = karnaugh_Haritasi_4degiskenli.length;

        switch (degiskenler_sayisi) {
            case 3:
                for (int i = 0; i < dogruluk_tab_durma_noktasi3; i++) {
                    for (int j = 0; j < karnaugh_Haritasi_3degiskenli[i].length; j++) {
                        System.out.print(" " + karnaugh_Haritasi_3degiskenli[i][j]);
                    }
                    System.out.println(" " + output[sayac]);
                    sayac++;
                }
                break;
            case 4:
                for (int i = 0; i < dogruluk_tab_durma_noktasi4; i++) {
                    for (int j = 0; j < karnaugh_Haritasi_4degiskenli[i].length; j++) {
                        System.out.print(" " + karnaugh_Haritasi_4degiskenli[i][j]);
                    }
                    System.out.println(" " + output[sayac]);
                    sayac++;
                }
                break;
            default:
                System.out.println("Geçersiz girdi sayısı");
                break;
        }
    }
}

