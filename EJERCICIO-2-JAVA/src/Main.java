public class Main {
    public static void main(String[] args) {
        try {
            EmpleadoIndefinido empleadoIndefinido = new EmpleadoIndefinido("esteban", "vidal ", 500000, 14);
            empleadoIndefinido.informacion();
            System.out.println("Finiquito a pagar: " + empleadoIndefinido.getPagarFiniquito());
            System.out.println("Días de vacaciones: " + empleadoIndefinido.darVacaciones());

            System.out.println("***************************************************************");

            EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal("victor", "moya", 300000, 3);
            empleadoTemporal.informacion();
            empleadoTemporal.extenderContrato(3);
            System.out.println("Contrato renovado: " + empleadoTemporal.isRenovado());
            System.out.println("Días de vacaciones: " + empleadoTemporal.darVacaciones());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
