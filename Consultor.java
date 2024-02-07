public class Consultor extends Trabajador {
    Integer horas;
    Double tarifa;

    public Consultor(String nombre, String puesto, String dirección, String num_seguridad_social, Integer horas, Double tarifa) {
        super(nombre, puesto, dirección, num_seguridad_social); // Llamo Superconstructor de la clase padre

        this.horas = horas;
        this.tarifa = tarifa;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double calcularPaga() {
        return horas*tarifa;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Dirección: "+getDirección()+" Puesto: "+getPuesto()+" Numero seguridad social: "+getnSS()+" Tarifa: "+tarifa+" Horas: "+horas;
    }
}
