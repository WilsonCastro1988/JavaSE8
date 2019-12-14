/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulbtic.recursos;

import java.util.Arrays;

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

		String[] nombres = { "Roberto", "Omar", "Julia", "Ana", "Ana" };
		java.util.Arrays.sort(nombres);
		int search = Arrays.binarySearch(nombres, "Ana");

		int searchindex = 0;
		for (String valor : nombres) {
			System.out.println("INDICE: " + searchindex);
			if (valor.equalsIgnoreCase("ana")) {
				System.out.println("VALOR ENCONTRADO SEARCH FOR:" + valor);
			}
		}

		System.out.println("SEACRH: " + search);

		for (String valor : nombres)
			System.out.println(valor);

		boolean[] valorA = new boolean[2];
		valorA[0] = true;
		valorA[1] = true;

		boolean[] valorA2 = new boolean[4];
		valorA2[0] = false;
		valorA2[2] = false;

		System.arraycopy(valorA, 0, valorA2, 0, valorA.length);

		int x1 = 0;
		while (x1 < valorA2.length) {
			System.out.println("VALOR ARRAYA BOOLEAN: " + valorA2[x1]);
			x1++;
		}

		char valorcA[];
		String valorsA[];
		int[] valoriA;
		double[] valordA;
		float valorfA[];

		Factura[] facturaA = { new Factura("Item", "Desc", 1, 12, 12, 12, 12, true),
				new Factura("Item", "Desc", 1, 12, 12, 12, 12, true) };

		for (int x = 0; x < 2; x++) {
			System.out.println("Resultados: " + facturaA[x].getCantidad());
		}

		for (Factura f : facturaA) {
			System.out.println("Resultados ForEach: " + f.getIva());
		}

		boolean[][] valorAA;
		valorAA = new boolean[2][2];

		valorAA[0][0] = true;
		valorAA[0][1] = true;

		valorAA[1][0] = false;
		valorAA[1][1] = false;

		// Filas
		for (int x = 0; x < 2; x++) {
			System.out.println("Impresion FILAS: " + valorAA[x][0]);
		}

		// columna
		for (int y = 0; y < 2; y++) {
			System.out.println("Impresion FILAS: " + valorAA[0][y]);
		}

		// fila columna
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				System.out.println("Impresion FILAS: " + valorAA[y][x]);
			}
		}

		char valorcAA[][];
		String valorsAA[][];
		int[][] valoriAA;
		double[][] valordAA;
		float valorfAA[][];

		Factura[][] facturaAA;

		boolean valor = false;
		char valorc = 'w';
		String valors = "Wilson";
		int valori = 2;
		double valord = 2e3; // 2.00
		float valorf = 2f; // 2.00
		System.out.println("Datos Primitivos: " + "\nboolean:" + valor + "\nchar: " + valorc + "\nString: " + valors
				+ "\nint: " + valori + "\ndouble: " + valord + "\nfloat: " + valorf);

		float suma = valorf + valori;
		System.out.println("SUMA ANTES: " + suma);
		float incremento = suma++;
		System.out.println("SUMA DESPUES: " + suma);
		System.out.println("INCREMENTO: " + incremento);
		float resta = valorf - valori;
		System.out.println("RESTA: " + resta);
		float mult = valorf * valori;
		System.out.println("MULT: " + mult);
		float div = valorf / valori;
		System.out.println("DIVISION: " + div);
		float resto = valorf % valori;
		System.out.println("RESTO: " + resto);

		if (!((3 <= 2) || (2 >= 3))) {
			System.out.println("es mayor");
		}
		if (3 >= 2) {
			System.out.println("es menor");
		}
		if (3 == 2) {
			System.out.println("es igual");
		}
		if (3 != 2) {
			System.out.println("no es igual");
		}

		int x = 'w';
		int y = x << 2;

		System.out.println("DESPLAZAMINETOS:\nValor x: " + x + "\n" + "Valor y: " + y);

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
