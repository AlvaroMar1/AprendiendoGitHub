import java.util.Scanner;

public class Saludo {
    public void saludar(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Hola "+ nombre + " hace mucho que no te veo");
        sc.close();

    }

    public void saludarConEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Cuantos años tienes?");
        int edad = sc.nextInt();

        if (edad<18){
            System.out.println("Hola " + nombre + " eres bastante joven.");
        }else{
            System.out.println("Hola " + nombre + " espero que tengas un gran día.");
        }
    }
}
