/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulbtic.recursos;

import bulbtic.facturas.Factura;

/**
 *
 * @author Wilson Castro
 */
public class TeoriaJavaSesion1 {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Factura factura = new Factura();
		boolean valor =  factura.verificacionFacturaActiva(true, null);
	}

	void metodo1() {
		var1 = "";
		var2 = "default";
		var3 = "protected";
		var4 = "private";
	}

	protected void metodo2() {
		var1 = "";
		var2 = "default";
		var3 = "protected";
		var4 = "private";
	}

	private void metodo() {
		System.out.println("teoriajavasesion1.TeoriaJavaSesion1.metodo()");
		var1 = "";
		var2 = "default";
		var3 = "protected";
		var4 = "private";
	}

	public String var1 = "public";
	String var2 = "default";
	protected String var3 = "protected";

	private String var4 = "private";

	public String getVar4() {
		return var4;
	}

	public void setVar4(String var4) {
		this.var4 = var4;
	}

}
