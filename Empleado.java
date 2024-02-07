public class Empleado extends Trabajador {
    private Double sueldo;
    private Double impuestos;

    public Empleado(String nombre, String puesto, String dirección, String num_seguridad_social, Double sueldo, Double impuestos) {
        super(nombre, puesto, dirección, num_seguridad_social); // Llamo Superconstructor de la clase padre

        this.sueldo = sueldo;
        this.impuestos = impuestos;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Double getImpuestos() {
        return impuestos;
    } 

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    /**
     * 
     * @return (Double) Paga neta después de impuestos
     */
    public Double calcularPaga() {
        return sueldo-(sueldo*impuestos/100);
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Dirección: "+getDirección()+" Puesto: "+getPuesto()+" Numero seguridad social: "+getnSS()+" Sueldo: "+sueldo+" Impuestos: "+impuestos;
    }
}
