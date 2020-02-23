 import java.util.Scanner;
 /**
 * Este programa esta diseñado para recibir numeros y saber su escritura en inglés
 * 
 * @author (Grupo) 
 * @version (1.0)
 */
  public class Proyecto
 {
  
      public static void main(String[] args)
   
     {
         Scanner teclado = new Scanner(System.in);
        //Datos de entrada
        //Preguntas de entrada
         System.out.println( " Ingrese el número que quiere traducir" );
	 String tra = teclado.next();
	//Arreglos
	 int [] chm =  new int [tra.length()];
	 int i = chm.length -  1 ;
	 int numero = Integer.parseInt(tra);
	
	 while (numero > 0 )
	{
	   chm [i] = numero % 10;
	   numero = numero / 10;
	   i -- ;
	}
	//Datos de salida
	 for (i=0; i < chm.length; i++)
	{
	    if (chm[i]==0)
	    {
	       System.out.println("zero");
	    }
	    else if (chm[i]==1)
	    {
	      System.out.println("one");
	    }
	    else if (chm[i]==2)
	    {
	      System.out.println("two"); 
	    }
	    else if (chm[i]==3)
	    {
	      System.out.println("three"); 
	    }
	    else if (chm[i]==4)
	    {
	      System.out.println("for"); 
	    }
	    else if (chm[i]==5)
	    {
	      System.out.println("five"); 
	    }
	    else if (chm[i]==6)
	    {
	      System.out.println("six"); 
	    }
	    else if (chm[i]==7)
	    {
	      System.out.println("seven"); 
	    }
	    else if (chm[i]==8)
	    {
	      System.out.println("eigth"); 
	    }
	    else
	    {
	      System.out.println("nine"); 
	    }
	   
	   
	
	}

	       
	
	
		    
    }
}
