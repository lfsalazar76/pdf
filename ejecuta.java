import pdfprocess.*;

class ejecuta{
	
	
   public static void main(String[] args){
	  if (args.length == 0)
      {
		 System.out.println("Debe ingresar un nombre de archivo");
      }
	  else
	  {	  
         archivopdf arch = new archivopdf(args[0]) ;
	     System.out.println("el archivo se llama "+arch.getName());
	  }
   }
}