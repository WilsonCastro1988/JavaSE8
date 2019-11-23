/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulbtic.recursos;

/**
 *
 * @author Wilson Castro
 */
public class TeoriaJavaSesion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean valor = false;
        char valorc = 'w';
        String valors = "Wilson";
        int valori = 2;
        double valord = 2e3; //2.00
        float valorf = 2f; //2.00
        System.out.println("Datos Primitivos: "
                + "\nboolean:" + valor
                + "\nchar: " + valorc
                + "\nString: " + valors
                + "\nint: " + valori
                + "\ndouble: " + valord
                + "\nfloat: " + valorf
        );

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
        int y = x<<2;
        
        System.out.println("DESPLAZAMINETOS:\nValor x: "+x+"\n"+"Valor y: "+y);

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
