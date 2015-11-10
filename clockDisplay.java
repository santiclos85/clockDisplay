
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
       if (horas<24 && minutos<60){horas=tiempoHoras;
           minutos=tiempoMinutos;}
       else
       {
           
          System.out.println("hora incorrecta");
           
           
        
    }
}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    {
        // put your code here
        
    }
}
