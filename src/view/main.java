package view;

import controller.ListaController;
import docarmo.listaEncadeadaInt.Lista;

public class main {

	public static void main(String[] args) {

		int[] vt = { 3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8 };

		ListaController control = new ListaController();
		
		Lista l = new Lista();
		
		l.addFirst(1);
		try {
			l.addLast(2);
			l.addLast(6);
			l.addLast(7);
			l.addLast(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		control.lista(vt, l);

	}

}
