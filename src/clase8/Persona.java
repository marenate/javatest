package clase8;

public class Persona {
   public String nombre ;
   public String id;

public Persona(){
    this.nombre="Marena";
}
public Persona(String Id){
    this.id="666";
}
public Persona (String nombre, String Id) {
    this(Id);
    this.nombre = nombre;
}
}
