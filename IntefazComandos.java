
import java.util.Scanner;

public class InterfazComandos {
    public static void main(String[] ar) {

      /*  Java tiene un metodo llamado System.in, la cual obtiene la informacion de usuario. Sin embargo, 
          Sytem.in no es tan simple como System.out. La razon porque no es tan facil es porque System.in 
          solo lee la informacion en bytes. Bytes no nos sirve de mucho ya que los programas usualmente 
          trabajan con valores de otro tipo (integrales, Strings, bool, etc). Para solucionar este 
          problema usamos la clase Scanner. La clase Scanner esta diseñado para leer los bytes y 
          convertirlo en valores primitivos (int, double, bool, etc) o en valores String.
      
          Primero tiene que crear un objeto Scanner y conectarlo con System.in

          Scanner teclado = new Scanner(System.in);

          La primera parte:
          Scanner teclado

          Este codigo declara una variable llamado teclado. El tipo de data de esta variable es Scanner. 
          Ya que Scanner es una clase, la variable teclado es un objeto de la clase Scanner.

          La segunda parte:
          = new Scanner(System.in);

     */

        Scanner teclado=new Scanner(System.in);

        String nombre1,nombre2;
        int edad1,edad2;
        System.out.print("Ingrese el nombre:");
        nombre1=teclado.next();
        System.out.print("Ingrese edad:");
        edad1=teclado.nextInt();
        System.out.print("Ingrese el nombre:");
        nombre2=teclado.next();
        System.out.print("Ingrese edad:");
        edad2=teclado.nextInt();
        System.out.print("La persona de mayor edad es:");

        if (edad1>edad2) {
            System.out.print(nombre1);
        } else {
            System.out.print(nombre2);
        }
    }
}