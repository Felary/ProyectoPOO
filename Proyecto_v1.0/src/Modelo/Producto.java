package Modelo;

public class Producto {

    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precio;
    private String proveedor;
    
    public Producto() {
    }   

    public Producto(String codigo, String descripcion, int cantidad, double precio, String proveedor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.proveedor = proveedor;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String provedor) {
        this.proveedor = provedor;
    }
}
