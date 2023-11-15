import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Base implements BanerInterface, SelectionInterface, LoadInterface, ProfileInterface, ArchiveInterface {
    private String usuario;
    private String contrasena;
    private List<String> listaPrestamo;

    public Base(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.listaPrestamo = new ArrayList<>();
    }

    @Override
    public void showOptions() {
        System.out.println("Opciones para usuario base:");
        System.out.println("1. Agregar recurso.");
        System.out.println("2. Mostrar lista de recursos.");
        System.out.println("3. Definir días de entrega.");
        System.out.println("4. Cambiar contraseña.");
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
        System.out.println("Lista de préstamos vaciada.");
    }

    private List<String> obtenerRecursosDisponibles() {
        return obtenerRecursosDisponibles();
    }

    @Override
    public void showlistResources() {
        System.out.println("Lista de recursos disponibles:");
        List<String> recursosDisponibles = obtenerRecursosDisponibles();
        for (String recurso : recursosDisponibles) {
            System.out.println(recurso);
        }
    }

    @Override
    public void returningDays() {
        System.out.println("Definir días de entrega para usuario base:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de días de entrega: ");
        int diasEntrega = scanner.nextInt();
        System.out.println("Días de entrega definidos: " + diasEntrega);
    }

    @Override
    public void changePassword(String newPassword) {
        contrasena = newPassword;
        System.out.println("Contraseña cambiada exitosamente.");
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
