package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase.Empleado;
import clase.Empleado.TipoEmpleado;
class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	/** Aplicando la técnica de Valores Límite */
	/*@Test
	void testCalculoNominaBruta() {
		//TipoEmpleado encargado = TipoEmpleado.Encargado;
		TipoEmpleado vendedor = TipoEmpleado.Vendedor;
		float valor_esperado=2000+0+90;
		float resultado = Empleado.calculoNominaBruta(vendedor, 999, 3);
		assertEquals(valor_esperado, resultado);
	}*/
	/*@Test
	void testCalculoNominaBruta() {
		TipoEmpleado encargado = TipoEmpleado.Encargado;
		//TipoEmpleado vendedor = TipoEmpleado.Vendedor;
		float valor_esperado=2500+100+90;
		float resultado = Empleado.calculoNominaBruta(encargado, 1000, 3);
		assertEquals(valor_esperado, resultado);
	}*/
	/*@Test
	void testCalculoNominaBruta() {
		//TipoEmpleado encargado = TipoEmpleado.Encargado;
		TipoEmpleado vendedor = TipoEmpleado.Vendedor;
		float valor_esperado=2000+200+90;
		float resultado = Empleado.calculoNominaBruta(vendedor, 1500, 3);
		assertEquals(valor_esperado, resultado);
	}*/
	@Test
	void testCalculoNominaBruta() {
		TipoEmpleado encargado = TipoEmpleado.Encargado;
		//TipoEmpleado vendedor = TipoEmpleado.Vendedor;
		float valor_esperado=2500+200+90;
		float resultado = Empleado.calculoNominaBruta(encargado, 1501, 3);
		assertEquals(valor_esperado, resultado);
	}
	/*@Test
	void testCalculoNominaNeta() {
		float valor_esperado=2099;
		float resultado = Empleado.calculoNominaNeta(2099);
		assertEquals(valor_esperado, resultado);
	}*/
	/*@Test
	void testCalculoNominaNeta() {
		float valor_esperado=(float) 1785.85;
		float resultado = Empleado.calculoNominaNeta(2101);
		assertEquals(valor_esperado, resultado);
	}*/
	/*@Test
	void testCalculoNominaNeta() {
		float valor_esperado=(float) 2124.15;
		float resultado = Empleado.calculoNominaNeta(2499);
		assertEquals(valor_esperado, resultado);
	}*/
	/*@Test
	void testCalculoNominaNeta() {
		float valor_esperado=(float) 2050;
		float resultado = Empleado.calculoNominaNeta(2500);
		assertEquals(valor_esperado, resultado);
	}*/
	@Test
	void testCalculoNominaNeta() {
		float valor_esperado=(float) 2050.82;
		float resultado = Empleado.calculoNominaNeta(2501);
		assertEquals(valor_esperado, resultado);
	}

}
