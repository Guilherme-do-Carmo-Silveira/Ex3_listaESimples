package controller;

import docarmo.listaEncadeadaInt.Lista;

public class ListaController {

	public ListaController() {
		super();
	}

	public void lista(int[] vt, Lista l) {
		int tamanhovt = vt.length;
		System.out.println(tamanhovt);
		boolean status = true;
		for (int i = 0; i < tamanhovt; i++) {
			int tamanho = l.size();
			status = true;
			for (int cont = 0; cont < tamanho; cont++) {
				try {
					if (vt[i] == l.get(cont)) {
						l.addLast(vt[i]);
						status = false;
						cont = tamanho;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if (status == true) {
				if (vt[i] % 2 == 0) {
					try {
						l.add(vt[i], 2);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				if (vt[i] % 2 == 1) {
					try {
						l.add(vt[i], 1);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		int tamanho = l.size();
		System.out.println(tamanho);
		for (int i = 0; i < tamanho; i++) {
			try {
				int valor = l.get(i);
				System.out.print(valor + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
