package main;

import javax.swing.JOptionPane;
import conversorMedida.Medida;
import conversorMoneda.Moneda;


public class Main {

	public static void main(String[] args) {
			
		
		String input = null;
		Moneda moneda = new Moneda();
		Medida medida = new Medida();
		String opcion = null;
		do {
			opcion = (JOptionPane.showInputDialog(null, 
					"Que desea Convertir?","Convertidor", 
					JOptionPane.INFORMATION_MESSAGE, null , new String[]{"Covertir Colones/Monedas","Convertir Metros/Medidas"}, "Elija")).toString();
			switch(opcion) {
	        case "Covertir Colones/Monedas":			
				input = JOptionPane.showInputDialog(null, "Ingresar Numero: ",
						"Conversor", JOptionPane.QUESTION_MESSAGE);
				if(ValidarNumero(input) == false) {
					JOptionPane.showMessageDialog(null, "Valor Incorrecto, Intente de nuevo");
				}else{
					double Minput = Double.parseDouble(input);
					moneda.ConvertirMoneda(Minput);
				}break;
	        case "Convertir Metros/Medidas":
	        	input = JOptionPane.showInputDialog(null, "Ingresar Numero: ",
						"Conversor", JOptionPane.QUESTION_MESSAGE);
				if(ValidarNumero(input) == false) {
					JOptionPane.showMessageDialog(null, "Valor Incorrecto, Intente de nuevo");
				}else{
					double Minput = Double.parseDouble(input);
					medida.ConvertirMedida(Minput);
				}break;       	
			}
			int continuar = JOptionPane.showConfirmDialog(null, "Desea Continuar? ", "Conversor" , JOptionPane.YES_NO_OPTION , JOptionPane.ERROR_MESSAGE , null);
			
            if (continuar == 0) {
            	System.out.println("Continuemos");
            	System.out.println(continuar);
            }else {break;}
			
		} while (true);
		
		System.out.println(input);
	}	
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0);
			return true;
			}catch(NumberFormatException e){
				return false;
			}
	}
}

            