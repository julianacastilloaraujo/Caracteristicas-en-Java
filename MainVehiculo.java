package vehiculo;
import java.util.Scanner;

public class MainVehiculo{
static Scanner entrada = new Scanner(System.in);

public static void main(String[]args){
  // TODO, codigo de aplicacion
  String color,marca,modelo,matricula;
  int ncaballos,npuertas;
  System.out.println("Favor ingresar color: ");
  color= entrada.nextLine();
  System.out.println("Favor ingresar marca: ");
  marca= entrada.nextLine();
  System.out.println("Favor ingresar modelo: ");
  modelo= entrada.nextLine();
  System.out.println("Favor ingresar ncaballos: ");
    ncaballos = entrada.nextInt();
    System.out.println("Favor ingresar npuertas: ");
    npuertas = entrada.nextInt();
  System.out.println("Favor ingresar modelo: ");
  matricula= entrada.nextLine();
  Vehiculo ejecutar;
  ejecutar = new Vehiculo(color,marca,modelo,ncaballos,npuertas,matricula);
  ejecutar.mostrarVehiculo();
}
}
