package _21670310176_ANAS_ALMAQTARI;
import java.io.FileNotFoundException;
public class _21670310176_Main {
	public static void main(String[] args) throws FileNotFoundException {
		  _21670310176_dosyaOkuma.dosyaAcmaVeOkuma();		  		  
		System.out.println("doğruluk tablosu:");
	_21670310176_Dogruluk_tablosuVe_karnaugh.dogruluk_tablosu(_21670310176_dosyaOkuma.degiskenler.length); 		
				int control =0;
				_21670310176_BooleanFunction.Control(control);
				_21670310176_BooleanFunction.ifadeler();				
	}

}
