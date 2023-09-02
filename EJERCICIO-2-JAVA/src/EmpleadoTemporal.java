class EmpleadoTemporal extends Empleado {
    private boolean isRenovado;

    public EmpleadoTemporal(String nombre, String apellido, int salario, int tiempoContrato) {
        super(nombre, apellido, salario, tiempoContrato);
        this.isRenovado = false;
        this.tieneVacaciones = false;
    }

    public boolean isRenovado() {
        return isRenovado;
    }

    public void extenderContrato(int meses) {
        this.isRenovado = true;
        tiempoContrato += meses;
        if (tiempoContrato > 6) {
            this.tieneVacaciones = true;
        }
    }

    @Override
    public int darVacaciones() {
        if (tieneVacaciones) {
            return super.darVacaciones();
        } else {
            throw error("no le corresponde vacaciones ");
        }
    }
}
