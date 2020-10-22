package com.mateusborja.javadevanalyst.lesson_6_2;

public class Aplicacao {

	public static void main(String[] args) {

		System.out.println("Carro:");
		Carro c = new Carro();
		c.setMarca("XYZ");
		c.setModelo("ABC");
		c.setAno(1992);
		c.setQuatroPortas(true);
		c.imprimirDados();
		//c.buzinar();
		

		System.out.println("\nMotocicleta:");
		Motocicleta m = new Motocicleta();
		m.setMarca("CCC");
		m.setModelo("ZZZ");
		m.setAno(2010);
		//m.empinar();
		//m.buzinar();
		m.imprimirDados();

		System.out.println("\nCaminhao:");
		Caminhao cam = new Caminhao();
		cam.setMarca("MMM");
		cam.setModelo("XXX");
		cam.setAno(1988);
		cam.imprimirDados();
		//cam.buzinar();
		
		Veiculo v1 = new Caminhao();
		
		

	}

}
