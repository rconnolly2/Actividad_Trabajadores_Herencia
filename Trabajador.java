public class Trabajador {
    private String nombre;
    private String puesto;
    private String dirección;
    private String num_seguridad_social;

    public Trabajador(String nombre, String puesto, String dirección, String num_seguridad_social) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.dirección = dirección;
        this.num_seguridad_social = num_seguridad_social;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDirección() {
        return dirección;
    }

    public String getnSS() {
        return num_seguridad_social;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setnSS(String nSS) {
        this.num_seguridad_social = nSS;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" Dirección: "+dirección+" Puesto: "+puesto+" Numero seguridad social: "+num_seguridad_social;
    }
}
