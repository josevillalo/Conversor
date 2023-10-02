package conversorMedida;

import javax.swing.JOptionPane;

public class Medida {
	
ConvertirMedida medida = new ConvertirMedida();
	
	public void ConvertirMedida(double valor) {
		String[] seleccion = new String[] {"Metros(m) a Pulgadas(in)","Pulgadas(in) a Metros(m)","Metros(m) a Pies(ft)","Pies(ft) a Metros(m)","Metros(m) a Millas(mi)","Millas(mi) a Metros(m)"};
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "medida", JOptionPane.QUESTION_MESSAGE, null, seleccion, "Seleccion")).toString();
        switch(opcion) {
        case "Metros(m) a Pulgadas(in)":
        	medida.MetrosAPulgadas(valor);
        	break;
        case "Pulgadas(in) a Metros(m)":
            medida.PulgadasAMetros(valor);
            break;
        case "Metros(m) a Pies(ft)":
           medida.MetrosAPies(valor);
           break;
        case "Pies(ft) a Metros(m)":
           medida.PiesAMetros(valor);
           break;
        case "Metros(m) a Millas(mi)":
        	medida.MetrosAMillas(valor);
        	break;
        case "Millas(mi) a Metros(m)":
        	medida.MillasAMetros(valor);
        	break;
        }
	}
}
