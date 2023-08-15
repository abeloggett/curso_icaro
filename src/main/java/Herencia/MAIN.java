package Herencia;

public class MAIN {
    public static void main(String[] args){
        Vehiculo toyota = new Vehiculo("toyota", "corolla", "2021");
        Coche Ford = new Coche("Ford","mustang",2000,5000);
   }
    System.out.println("marca de vehiculo"+ toyota.getMarca());
    System.out.println("Modelo de vehiculo"+ toyota.getModelo());
    System.out.println("año vehiculo"+ toyota.getAge());
    toyota.Acelerar();

      System.out.println("marca de vehiculo"+ Ford.getMarca());
    System.out.println("Modelo de vehiculo"+ Ford.getModelo());
    System.out.println("año vehiculo"+ Ford.getAge());
    System.out.println("cilindrada"+ Ford. getCilindradas());
    Ford.Acelerar();
}
