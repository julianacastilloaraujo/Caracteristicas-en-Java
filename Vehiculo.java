package vehiculo;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      import java.util.Scanner;

class Vehiculo{
  private String placa, marca, modelo;
  private int kilometraje;

  Vehiculo( String placa, String marca, String modelo, int kilometraje){
    setPlaca(placa);
    setMarca(marca);
    setModelo(modelo);
    setKilometraje(kilometraje);
  }

    Vehiculo(String color, String marca, String modelo, int ncaballos, int npuertas, String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /* Metodos Modificadores */
  public void  setPlaca(String n){placa =n; }
   public void  setMarca(String a){marca =a; }
    public void  setModelo(String c){modelo =c; }
     public void  setKilometraje(Int e){Kilometraje =e; }
  /* Metodos Accesores */
  public String getPlaca(){return placa; }
  public String getMarca(){return marca; }
  public String getModelo(){return modelo; }
  public int getKilometraje(){return kilometraje; }

  public void mostrarVehiculo(){
    System.out.print("\nPlaca: " +getPlaca()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nKilometraje: " +getKilometraje() );
  }
}
  public class MainVehiculo{
  static Scanner entrada=new Scanner(System.in);

  public static void main(String[]args){
    
    String placa,marca,modelo;
    int Kilometraje;
    System.out.println("Favor ingresar placa: ");
    placa= entrada.nextLine();
    System.out.println("Favor ingresar marca: ");
    marca= entrada.nextLine();
    System.out.println("Favor ingresar modelo: ");
    modelo= entrada.nextLine();
    System.out.println("Favor ingresar Kilometraje: ");
    kilometraje= entrada.nextInt();
    Vehiculo e;
    e= new Vehiculo(placa,marca,modelo,kilometraje);
    e.mostrarVehiculo();
  }
}