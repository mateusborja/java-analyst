/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 7.4 interfaces - mod de acesso default e static - classe def
package com.mateusborja.javadevanalyst.lesson_7_4;

public interface Automovel {

	void acelear();
	void frear();
	
	default void derrapar() {
		acelear();
		acelear();
		frear();
	}
	
	static int velocidadeMaxima() {
		return 300;
	}

}
