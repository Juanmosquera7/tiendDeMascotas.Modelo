package tiendaDeMascotas.Modelo;

class Mascota {
    private String nombre;
    private TipoMascota tipo;
    private String raza;
    private int edad;
    private String codigo;

    public String getNombre(){
        return nombre;
    }
   public void setNombre(String nombre){
    this.nombre = nombre;
   }
   
   public TipoMascota getTipo(){
    return tipo;
   }
   public void setTipo(TipoMascota tipo){
    this.tipo = tipo;
  }
  
  
  public String getRaza(){
    return raza;
  }
  public void setRaza(String raza){
    this.raza = raza;
  } 
  
  public int getEdad(){
    return edad;
  }
  public void setEdad(int edad){
    this.edad = edad;
  }
  
  
  public String getCodigo(){
    return codigo;

  }
  public void setCodigo(String codigo){
    this.codigo = codigo;
  }


} 