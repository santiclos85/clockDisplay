
/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockDisplay
{
    // instance variables - replace the example below with your own
    private int horas;
    private int minutos;

    /**
     * nos permite expresar un momento determinado en horas y minutos.
     */
    public void setTime(int tiempoHoras,int tiempoMinutos)
    {
        // initialise instance variables
       if (horas<24 && minutos<60)
       {
           horas=tiempoHoras;
           minutos=tiempoMinutos;
       }
       else
       {
           
          System.out.println("hora incorrecta");
           
           
        
       }
    }
   /**
     * nos permite avanzar en un minuto el tiempo.
     */
    public void timeTick()
    {
      if(horas>=23 && minutos>=59)
       
       {
          horas=0;
          minutos=0;
           
       }
       else if(horas<=23 && minutos>=59)
       {
         horas=horas+1;
         minutos=0;
          
       }
       else
       {
           minutos=minutos+1;
        }
     }
/**
     * devolver una cadena de 5 caracteres
     */
    public String getTime()
   {
    String horasAhora = "%02d:%02d";
    String horasMostradas = String.format (horasAhora,horas,minutos);
    return horasMostradas;
   }
}

 