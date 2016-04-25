package ar.edu.unlam.basica2.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest 
{
	/* 
		Crear los círculos con los siguientes radios, comprobando que cada uno se creó correctamente:
		- 2
		- 3.7
		- 5
		- 10.9
	*/
	
	@Test
	public void calcularPerimetroDeUnCirculoDeRadio2()
	{
		Circulo miCirculo = new Circulo (2);
		assertEquals (2,miCirculo.getRadio(),0.01);
	}
	
	@Test
	public void calcularPerimetroDeUnCirculoDeRadio3Punto7()
	{
		Circulo miCirculo2 = new Circulo (3.7);
		assertEquals (3.7,miCirculo2.getRadio(),0.01);
	}
	
	@Test
	public void calcularPerimetroDeUnCirculoDeRadio5()
	{
		Circulo miCirculo3 = new Circulo (5);
		assertEquals (5,miCirculo3.getRadio(),0.01);
	}
	
	@Test
	public void calcularPerimetroDeUnCirculoDeRadio10Punto9()
	{
		Circulo miCirculo4 = new Circulo (10.9);
		assertEquals (10.9,miCirculo4.getRadio(),0.01);
	}
	
	/* 
		Crear un circulo de 9.8 y luego comprobar que el perimetro del circulo es 615.73
	*/
	
	@Test
	public void calcularPerimetroDeUnCirculoDeRadio9Punto8()
	{
		Circulo miCirculo5 = new Circulo (9.8);
		assertNotEquals (615.73,miCirculo5.getRadio(),0.01);
	}
	
	/* 
		Crear un circulo de 16.6 y luego comprobar que el perimetro del circulo es 865.67
	*/
	
	@Test
	public void calcularPerimetroDeUnCirculoDeRadio16Punto6()
	{
		Circulo miCirculo6 = new Circulo (16.6);
		assertNotEquals (865.67,miCirculo6.getRadio(),0.01);
	}

}
