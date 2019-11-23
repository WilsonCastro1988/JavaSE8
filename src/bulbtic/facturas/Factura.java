/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulbtic.facturas;

import bulbtic.clientes.Cliente;

/**
 *
 * @author Wilson Castro
 */
public class Factura {

    //caracteristicas - atributos
    //factura tiene item(objeto de venta), descripcion, valores, totales
    public String item;
    public String descripcion;
    private int cantidad;
    private float valorUnit;
    private float subtotal;
    private float total;
    private float iva;
    private boolean activo;
    private Cliente cliente;

    //Constructores
    public Factura() {
    
    }

    public Factura(String item, 
            String descripcion, int cantidad, 
            float valorUnit, float subtotal, 
            float total, float iva, 
            boolean activo, Cliente cliente) {
        this.item = item;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valorUnit = valorUnit;
        this.subtotal = subtotal;
        this.total = total;
        this.iva = iva;
        this.activo = activo;
        this.cliente = cliente;
    }

    //Metodos
    //metodo para verificar si la factura esta activa o no
    public boolean verificacionFacturaActiva(boolean activo) {
        setActivo(activo);
        return isActivo();
    }

    public void verificacionFactura() {
        this.activo = false;
    }
    
    private void calcularSubTotal()
    {
        this.subtotal = this.valorUnit*this.cantidad;
    }
    
    private float calcularTotal(float subtotal)
    {
        this.total += subtotal;
        //TODO: si el total es mayor a $100 entonces ofrecer despuesto de 10%
        return this.total;
    }
    
     public void llenadoFactura(String item, String descripcion, int cantidad, float valorUnit, float subtotal, float total, float iva, boolean activo) {
        this.item = item;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valorUnit = valorUnit;
        this.subtotal = subtotal;
        this.total = total;
        this.iva = iva;
        this.activo = activo;
    }

    //Getters y Setters
    public float getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(float valorUnit) {
        this.valorUnit = valorUnit;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
