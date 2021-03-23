import pdfprocess.*;
import java.io.*;

class ejecuta{
	
	
   public static void main(String[] args) throws IOException{
	try 
	{
	  int i = 0 ;	
      if (args.length == 0)
      {
		 System.out.println("Debe ingresar un nombre de archivo");
      }
	  else
	  {	  
         
		 folder f = new folder(args[0]);
		 i = f.recorreFolder();
		 System.out.println("Archivos trabajados: "+Integer.toString(i))  ;
	  }
	} 
	catch(IOException e)
	{ System.out.println(e.getMessage()); }
   
  }
}