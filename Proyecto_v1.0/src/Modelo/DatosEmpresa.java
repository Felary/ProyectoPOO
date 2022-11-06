package Modelo;

public class DatosEmpresa {

    private String nombreEmpreza;
    private String ruc;
    private String telefono;
    private String direccion;

    public DatosEmpresa() {
    }

    public String getNombreEmpreza() {
        return nombreEmpreza;
    }

    public void setNombreEmpreza(String nombreEmpreza) {
        this.nombreEmpreza = nombreEmpreza;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
