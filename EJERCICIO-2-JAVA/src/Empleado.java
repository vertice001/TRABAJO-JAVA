class Empleado {

    private String nombre;
    private String apellido;
    private int salario;
    protected int tiempoContrato;
    private int diasVacaciones;
    protected boolean tieneVacaciones;

    public Empleado(String nombre, String apellido, int salario, int tiempoContrato) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.tiempoContrato = tiempoContrato;
        this.diasVacaciones = 0;
        this.tieneVacaciones = false;
    }

    public void informacion() {

        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Salario: " + salario);
        System.out.println("Tiempo de contrato: " + tiempoContrato + " meses");
        System.out.println("Días de vacaciones: " + diasVacaciones);
        System.out.println("Tiene vacaciones: " + tieneVacaciones);

    }

    public int getPagarFiniquito() {

        return salario * tiempoContrato;
    }

    public int darVacaciones() {

        return 2 * tiempoContrato;
    }

}