/**
 *
 * @author DAVID JACOB LÓPEZ MORATAYA
 * 5090-17-12655
 */
//import ClasesBase.Base;
import javax.swing.JOptionPane;
public class Auto {  
    private String placa;
    private double velocidadActual;
    private double velocidadMaxima;
    private double velocidadMinima;
    private boolean estado;
    
    
    //Método Constructor por Defecto
    
    public Auto(){
    this.placa="RD1234";
    this.velocidadActual =0;
    this.velocidadMaxima =150;
    this.velocidadMinima=0;
    this.estado=false;
    }
    
    //====================================================================================================
    //====================================================================================================
    //====================================================================================================
    
    //Métodos de tipo SET y GET
    public void setPlaca(String placa){
    this.placa=placa;
    }
    
    
       public void setVelocidadActual(double velocidadActual){
   this.velocidadActual = velocidadActual;
    }
    
    public void setVelocidadMaxima(double velocidadMaxima){
    this.velocidadMaxima = velocidadMaxima;
    }
    
    public void setVelocidadMinima(double velocidadMinima){
    this.velocidadMinima = velocidadMinima;
    }
    
    
    public void setEstado(boolean estado){
    this.estado= estado;
    }
    
    public String getPlaca(){
    return(this.placa);
    }
    
    public double getVelocidadActual(){
    return(this.velocidadActual);
    }
    
      public double getVelocidadMaxima(){
    return(this.velocidadMaxima);
    } 
    
    public double getVelocidadMinima(){
    return(this.velocidadMinima);
    } 
    
    public boolean getEstado(){
    return(this.estado);
    }
    
    
    
    
    //====================================================================================================
    //====================================================================================================
    //====================================================================================================
    //MÉTODOS OPERACIONALES
    public String devolverEstadoDelAuto(){
    if(getEstado())
    {
        return "ENCENDIDO";
        
    }
        return "APAGADO";
    
    
    
}


    public void formarMensajeDeSalidaPorConsola(String mensaje){
    int largo=mensaje.length();
    int i; System.out.print("+");
   
    for(i=1;i<=largo;i++){
        System.out.print("-");
    }
    System.out.print("+");
    System.out.println("|" + mensaje + "|");
    System.out.print("+");
    
    
    for(i=1; i<=largo; i++){
    System.out.print("-");
    }
    System.out.println("+");Syste.out.println("");
    }
    
    
    
    public void encenderAuto(){
    if(getEstado()){
        formarMensajeDeSalidaPorConsola("El Auto YA ESTABA encendido");
    }
    else{
        setEstado(true);
        formarMensajeDeSalidaPorConsola("El Auto HA SIDO encendido");
    }
 }
    
    
    
    public void aumentarVelocidadAuto(){
        if(getEstado()){
            String dato; int cantidad; dato=JOptionPane.showInputDialog("Velocidad Actual=" +
             getVelocidadActual()+ "\nIngrese la cantidad a aumentar");
        
        
        cantidad =Integer.parseInt(dato);
        
        setVelocidadActual(getVelocidadActual()+ cantidad);
        formarMensajeDeSalidaPorConsola("Velocidad del Auto Actual = "+getVelocidadActual());}
            else {formarMensajeDeSalidaPorConsola("El Auto esta APAGADO");}
        }
        
    public void manejarTableroDeComandosDelAuto(){
        String arregloDeOpciones[] = {"1.Encender Auto\n\t" ,"2.Aumentar velocidad\n\t","3.Reducir Velocidad\n\t","4.Cargar Tanque de Gasolina\n\t","5. Cargar Tanque de Aceite\n\t", "6.Mostrar Condiciones del Auto\n\t", "7.Apagar Auto\n\t","8.Salir\n\t"};
    
        
        
        int opcion;
        do{
            System.out.println("***********************************************************");
            System.out.println("***************Tablero de Comando del Auto ****************");
            System.out.println("***********************************************************");
            
            opcion=Base.pintarMenu(arreloDeOpciones);
            
        
        }
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}