package conversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirColon {
	
	public void ColonADolar(double valor) {
		double Dolar = valor / 535.12;
		Dolar = (double) Math.round(Dolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Dolar+ " Dolares");
	}
	
	public void ColonAEuro(double valor) {
		double Euro = valor / 573.14;
		Euro = (double) Math.round(Euro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +Euro+ " Euros");
	}
	
	public void ColonALibra(double valor) {
		double Libra = valor / 0.0015;
        Libra = (double) Math.round(Libra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Libra+ " Libras esterlinas");
	}
	
	public void ColonAYen(double valor) {
		double Yen = valor / 3.63;
        Yen = (double) Math.round(Yen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Yen+ " Yenes Japoneses");
	}
	
	public void ColonAWon(double valor) {
		double Won = valor / 2.50;
        Won = (double) Math.round(Won *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Won+ " Won Coreanos");
	}
	
	public void ColonAYuan(double valor) {
		double Yuan = valor / 72.86;
        Yuan = (double) Math.round(Yuan *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Yuan+ " Yuan Chinos");
	}

}
