class EmpleadoIndefinido extends Empleado {
    public EmpleadoIndefinido(String nombre, String apellido, int salario, int tiempoContrato) {
        super(nombre, apellido, salario, tiempoContrato);

        if (tiempoContrato > 6) {
            this.tieneVacaciones = true;
        } else {
            this.tieneVacaciones = false;
        }
    }

    @Override
    public int getPagarFiniquito() {
        if (tiempoContrato >= 12) {
            return super.getPagarFiniquito() + 50000;
        }
        return super.getPagarFiniquito();
    }

    @Override
    public int darVacaciones() {
        if (tieneVacaciones) {
            return super.darVacaciones();
        } else {
            throw new IllegalArgumentException("no le corresponde vacaciones ");

        }
    }
}