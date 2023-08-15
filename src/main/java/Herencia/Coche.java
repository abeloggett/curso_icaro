package Herencia;

public class Coche extends Vehiculo {
    private int Cilindradas;
  public coche(String Marca, String Modelo, int Age, int Cilindradas){
      super(Marca,Modelo,Age)
      this.Cilindradas = Cilindradas
  }

    public Coche(String ford, String mustang, int i, int i1) {
        super();
    }

    public int getCilindradas(){
      return this.Cilindradas

  }
  public void setCilindradas(int Cilindradas){
      this.Cilindradas = Cilindradas;
  }
  @Override
   public void Acelerar (){
      System.out.println("el coche esta acelerando")
  }

}
