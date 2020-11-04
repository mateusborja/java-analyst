/*metodo ir enxega apenas os metodos - interface
 * 
 */

package com.mateusborja.javadevanalyst.lesson_7_3;

public class Rota {
	
	public void ir(Automovel a) {
		
		a.acelerar();
		a.virarDireita();
		a.virarEsquerda();
		a.virarDireita();
		a.frear();
	}

}
