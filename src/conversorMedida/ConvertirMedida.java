package conversorMedida;

import javax.swing.JOptionPane;

public class ConvertirMedida {
	
	public void MetrosAPulgadas(double valor) {
		double pulgadas= valor /  0.254;
    	pulgadas= (double) Math.round(pulgadas *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Metros son " +pulgadas+ " Pulgadas ");
	}
	public void PulgadasAMetros(double valor) {
		double metros= valor * 0.254;
    	metros= (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ "Pulgadas son " +metros+ " Metros ");
	}
	public void MetrosAPies(double valor) {
		double pies= valor /  0.3048;
    	pies= (double) Math.round(pies *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Metros son " +pies+ " Pies ");
	}
	public void PiesAMetros(double valor) {
		double metros= valor * 0.3048;
    	metros= (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Pies son " +metros+ " Metros ");
	}
	public void MetrosAMillas(double valor) {
		double millas= valor /  1609.344;
    	millas= (double) Math.round(millas *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Metros son " +millas+ " Millas ");
	}
	public void MillasAMetros(double valor) {
		double metros= valor * 1609.344;
    	metros= (double) Math.round(metros *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Millas son " +metros+ " Metros ");
	}
	
}