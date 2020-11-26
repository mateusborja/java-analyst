/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.javadevanalyst.lesson_7_4;

public class AplicacaoAutomovel {
	
	public static void main(String[] args) {
		
		Ferrari f = new Ferrari();
		Porsche p = new Porsche();
		
		f.acelear();
		p.acelear();
		
		f.derrapar();
		
		p.acelear();
		
		int vm = Automovel.velocidadeMaxima();
		System.out.println(vm);
				
		
		
	}

}
