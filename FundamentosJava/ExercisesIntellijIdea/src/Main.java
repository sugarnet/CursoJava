import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Escribe tu solucion aqui
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Proporciona el id:");
        int id = Integer.valueOf(scanner.nextLine());

        System.out.println("Proporciona el precio:");
        double precio = Double.valueOf(scanner.nextLine());

        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.nextLine().charAt(0);

        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.valueOf(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);*/


        /*System.out.println("Proporciona el alto:");
        int alto = Integer.valueOf(scanner.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.valueOf(scanner.nextLine());

        System.out.println("Area: " + (alto * ancho));
        System.out.println("Perimetro: " + ((alto + ancho) * 2));*/

        /*System.out.println("Proporciona el numero1:");
        int numero1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.valueOf(scanner.nextLine());

        int numeroMayor = numero1 >= numero2 ? numero1 : numero2;
        System.out.println("El numero mayor es:");
        System.out.println(numeroMayor);*/

        /*int a = 2;
        int b = 3;
        int res1 = 6 / ++a * 4;
        int res3 = -3 + res1;
        int res4 = res3 - b--; // -3 + 6 / ++a * 4 - b-- + b
        int res5 = res4 + b;



        System.out.println(res1);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res1);
        System.out.println(res3);
        System.out.println(res4);*/

        System.out.print("Proporciona un valor entre 0 y 10:");
        int numero = Integer.valueOf(scanner.nextLine());

        if(numero >= 9 && numero <=10)
            System.out.print("A");
        else if(numero >=8 && numero < 9)
            System.out.print("B");
        else if(numero >=7 && numero < 8)
            System.out.print("C");
        else if(numero >=6 && numero < 7)
            System.out.print("D");
        else if(numero >=0 && numero < 6)
            System.out.print("F");
        else
            System.out.print("Valor desconocido");


    }
}
