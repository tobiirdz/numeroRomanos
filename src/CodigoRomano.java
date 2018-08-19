
public class CodigoRomano {
	
	int unidad, decena, centena, millar;
	
	String conversorRomano (int numero) {
		String numeroRomano = "";
		millar = (numero / 1000) % 10;
		centena = (numero / 100) % 10;
		decena = (numero / 10) % 10;
		unidad = numero % 10;
		
		//millar
		for(int i=0; i<millar; i++) {
			numeroRomano += "M";
		}
		
		//centena
		if(centena == 9) {
			numeroRomano += "CM";
		}else if(centena >= 5) {
			numeroRomano += "D";
			for(int i = 6; i <= centena; i++) {
				numeroRomano += "C";
			}
		}else if(centena == 4) {
			numeroRomano += "CD";
		}else {
			for(int i=0; i < centena; i++) {
				numeroRomano += "C";
			}
		}
		
		//decena
		if(decena == 9) {
			numeroRomano += "XC";
		}else if(decena >= 5) {
			numeroRomano += "L";
			for(int i=6; i <= decena; i++) {
				numeroRomano += "X";
			}
		}else if(decena == 4) {
			numeroRomano += "XL";
		}else {
			for(int i=0; i < decena; i++) {
				numeroRomano += "X";
			}
		}
		
		//unidades
		
		if(unidad == 9) {
			numeroRomano += "IX";
		}else if(unidad >= 5) {
			numeroRomano += "V";
			for(int i=6; i <= unidad; i++) {
				numeroRomano += "I";
			}
		}else if(unidad == 4) {
			numeroRomano += "IV";
		}else {
			for(int i=0; i < unidad; i++) {
				numeroRomano += "I";
			}
		}
		return numeroRomano;
	}
}
