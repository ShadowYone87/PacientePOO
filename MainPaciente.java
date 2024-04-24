import java.util.Scanner;
public class MainPaciente {
        public static void main(String[] args) {
        Scanner e1 = new Scanner(System.in);
            
     System.out.println("Ingresa nombre y apellido");
        String nombre =e1.next();
        String apellido=e1.next();
        System.out.println("Ingresa tu edad");
        int edad=e1.nextInt();
        System.out.println("Ingresa tu altura");
        double altura=e1.nextDouble();
        
        Paciente e2 = new Paciente();
        e2.nombre=nombre;
        e2.apellido= apellido;
        e2.edad= edad;
        e2.altura=altura;
        e2.mostrarNombreA();
        e2.mostrarEdad();
        e2.mostrarAtura();
        


    }
}