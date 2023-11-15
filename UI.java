import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Base usuarioBase = new Base("usuarioBase", "contrasenaBase");
        Premium usuarioPremium = new Premium("usuarioPremium", "contrasenaPremium");

        int op;
        do {
            System.out.println("Bienvenido al programa de gestión de usuarios:");
            System.out.println("1. Acceder como Usuario Base");
            System.out.println("2. Acceder como Usuario Premium");
            System.out.println("3. Crear nuevo usuario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    interactuarConUsuario(usuarioBase);
                    break;
                case 2:
                    interactuarConUsuario(usuarioPremium);
                    break;
                case 3:
                    crearNuevoUsuario();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
                    break;
            }
        } while (op != 4);

        scanner.close();
    }

    public static void interactuarConUsuario(Base usuario) {
        int op;
        Scanner scanner = new Scanner(System.in);
        do {
            usuario.showOptions();
            System.out.print("Seleccione una opción o ingrese 0 para volver al menú principal: ");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    usuario.addResource("libro"); 
                    break;
                case 2:
                    usuario.showlistResources();
                    break;
                case 3:
                    usuario.returningDays();
                    break;
                case 4:
                    System.out.print("Ingrese la nueva contraseña: ");
                    String nuevaContrasena = scanner.next();
                    usuario.changePassword(nuevaContrasena);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
                    break;
            }
        } while (op != 0);
        
        scanner.close();
    }

    public static void interactuarConUsuario(Premium usuario) {
        int op;
        Scanner scanner = new Scanner(System.in);
        do {
            usuario.showOptions();
            System.out.print("Seleccione una opción o ingrese 0 para volver al menú principal: ");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    usuario.addResource("libro");
                    break;
                case 2:
                    usuario.showlistResources();
                    break;
                case 3:
                    usuario.returningDays();
                    break;
                case 4:
                    System.out.print("Ingrese la nueva contraseña: ");
                    String nuevaContrasena = scanner.next();
                    usuario.changePassword(nuevaContrasena);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
                    break;
            }
        } while (op != 0);
        
        scanner.close();
    }

    public static void crearNuevoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creación de nuevo usuario:");
        System.out.print("Ingrese el nombre de usuario: ");
        String nuevoUsuario = scanner.next();
        System.out.print("Ingrese la contraseña: ");
        String nuevaContrasena = scanner.next();
        System.out.println("Seleccione el plan: ");
        System.out.println("1. Gratis");
        System.out.println("2. Premium");
        System.out.print("Seleccione el plan (1 o 2): ");
        int plan = scanner.nextInt();

        if (plan == 1) {
            Base nuevoUsuarioBase = new Base(nuevoUsuario, nuevaContrasena);
            System.out.println("Usuario base creado con éxito.");
            interactuarConUsuario(nuevoUsuarioBase);
        } else if (plan == 2) {
            Premium nuevoUsuarioPremium = new Premium(nuevoUsuario, nuevaContrasena);
            System.out.println("Usuario premium creado con éxito.");
            interactuarConUsuario(nuevoUsuarioPremium);
        } else {
            System.out.println("Plan no válido. Creación de usuario cancelada.");
        }

        scanner.close();
    }
}
