import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Premium implements BanerInterface, SelectionInterface, LoadInterface, ProfileInterface, ArchiveInterface {
    private String usuario;
    private String contrasena;
    private List<String> listaPrestamo;

    public Premium(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.listaPrestamo = new ArrayList<>();
    }

    @Override
    public void showOptions() {
        System.out.println("Opciones para usuario premium:");
        System.out.println("1. Agregar recurso.");
        System.out.println("2. Mostrar lista de recursos.");
        System.out.println("3. Definir días de entrega.");
        System.out.println("4. Cambiar contraseña.");
        System.out.println("5. Seleccionar dirección de envío.");
        System.out.println("6. Aplicar cupón de días adicionales.");
    }

    @Override
    public void addResource(String typeResource) {
        if (typeResource.equals("libro") || typeResource.equals("revista")) {
            listaPrestamo.add(typeResource);
            System.out.println(typeResource + " agregado a la lista de préstamos.");
        } else {
            System.out.println("Tipo de recurso no válido.");
        }
    }

    @Override
    public void clearResource() {
        listaPrestamo.clear();
        System.out.println("Lista de préstamos vaciada para usuario premium.");
    }

    @Override
    public void showlistResources() {
        System.out.println("Lista de recursos disponibles para usuario premium:");
        List<String> recursosDisponibles = obtenerRecursosDisponiblesPremium();
        for (String recurso : recursosDisponibles) {
            System.out.println(recurso);
        }
    }
    
    private List<String> obtenerRecursosDisponiblesPremium() {
        List<String> recursosPremium = new ArrayList<>();
        recursosPremium.add("Libro premium 1");
        recursosPremium.add("Libro premium 2");
        recursosPremium.add("Revista premium 1");
        return recursosPremium;
    }

    @Override
    public void returningDays() {
        System.out.println("Definir días de entrega para usuario premium:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de días de entrega: ");
        int diasEntrega = scanner.nextInt();
        System.out.println("Días de entrega definidos para usuario premium: " + diasEntrega);
    }

    @Override
    public void changePassword(String newPassword) {
        contrasena = newPassword;
        System.out.println("Contraseña cambiada exitosamente para usuario premium.");
    }

    @Override
    public void export() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'export'");
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

}
