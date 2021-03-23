package pdfprocess ;
/** 
@name archivopdf
@description manejador de los atributos de un archivo
*/

public class archivopdf
{

    private String name ;
	
    public archivopdf() 
    {
        name = "" ;
    }
	
    public archivopdf(String n)
    {
	name = n ;
    }

    public void setName(String n)
    {
	name = n ;
    }
	 
    public String getName()
    {
	return name ;
    }
}