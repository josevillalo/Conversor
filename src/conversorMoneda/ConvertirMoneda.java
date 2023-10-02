package conversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {

	public void DolarAColon(double valor) {
		double Dolar = valor * 535.12;
		Dolar = (double) Math.round(Dolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " +Dolar+ 
        		" Colones Costarricences(CRC).");
	}
	
	public void EuroAColon(double valor) {
		double Euro = valor * 573.14;
		Euro = (double) Math.round(Euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes ₡ " +Euro+ 
				" Colones Costarricences(CRC).");
	}
	
	public void LibraAColon(double valor) {
		double Libra = valor * 0.0015;
        Libra = (double) Math.round(Libra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " +Libra+ 
        		" Colones Costarricences(CRC).");
	}
	
	public void YenAColon(double valor) {
		double Yen = valor * 3.63;
        Yen = (double) Math.round(Yen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " +Yen+ 
        		" Colones Costarricences(CRC).");
	}
	
	public void WonAColon(double valor) {
		double Won = valor * 2.50;
        Won = (double) Math.round(Won *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " +Won+ 
        		" Colones Costarricences(CRC).");
	}
	
	public void YuanAColon(double valor) {
		double Yuan = valor * 72.86;
        Yuan = (double) Math.round(Yuan *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " +Yuan+ 
        		" Colones Costarricences(CRC).");
	}
	
	
}
