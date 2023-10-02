package conversorMoneda;

import javax.swing.JOptionPane;

public class Moneda {
	
	 public void ConvertirMoneda(double input) {
		 
		    ConvertirColon colon = new ConvertirColon();
		    ConvertirMoneda moneda = new ConvertirMoneda();
		  
		    String[] seleccion = new String[]{"Colon a Dolar", "Colon a Euro", "Colon a Libras","Colon a Yen",
			"Colon a Won Coreano","Colon a Yuan", "Dolar a Colon", "Euro a Colon", 
			"Libras a Colon","Yen a Colon","Won Coreano a Colon","Yuan a Colon"};
		
		 	String opcion = (JOptionPane.showInputDialog(null, 
			"Elija tipo de Conversion:  ", "Conversor de Moneda", 
			JOptionPane.INFORMATION_MESSAGE, null , seleccion , "Elija")).toString();
		 	
		 	System.out.println(opcion);
		 	
		 	switch(opcion) {
	        case "Colon a Dolar":
	        	colon.ColonADolar(input);
	        	break;
	        case "Colon a Euro":
	        	colon.ColonAEuro(input);
	        	break;
	        case "Colon a Libras":
	        	colon.ColonALibra(input);
	        	break;
	        case "Colon a Yen":
	        	colon.ColonAYen(input);
	        	break;
	        case "Colon a Won Coreano":
	        	colon.ColonAWon(input);
	        	break;  
	        case "Colon a Yuan":
	        	colon.ColonAYuan(input);
	        	break;	        
	        case "Dolar a Colon":
	        	moneda.DolarAColon(input);
	        	break;
	        case "Euro a Colon":
	        	moneda.EuroAColon(input);
	        	break;
	        case "Libras a Colon":
	        	moneda.LibraAColon(input);
	        	break;
	        case "Yen a Colon":
	        	moneda.YenAColon(input);
	        	break;
	        case "Won Coreano a Colon":
	            moneda.WonAColon(input);
	            break;
		 	}
		 	
	 }
}
