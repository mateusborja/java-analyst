package com.mateusborja.javadevanalyst.lesson_7_3;

public class AplicacaoAutomovel {

	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		Rota rota = new Rota();

		f.abrirPorta();
		rota.ir(f);

		f.getPreco();

		AnelBrilhante a = new AnelBrilhante();
		Vendedor v = new Vendedor();

		v.mostrarPreco(f);
		v.mostrarPreco(a);
		
		Bicicleta b = new Bicicleta();
		v.mostraPreco(b);

	}

}
