/**
 *  @name  Folder
 * 
 *  @desc  Esta clase contiene el manejo de los folders 
 */

package pdfprocess ;




import java.io.*;



public class folder{

    private String FolderName ;

    public folder(){

    }

    public folder(String name){
        FolderName = name  ;
    }

    public void setFolderName(String vName){
        FolderName = vName ;
    }

    public String getFolderName(){
        return FolderName ;
    }

    public int recorreFolder() throws IOException{ 
        int i=0;
        File dp = new File(FolderName) ;
        if (dp.isDirectory())
        {
            FileFilter ff = new FileFilter(){
                public boolean accept(File dir){
                    return dir.isFile();
                }
            };
            File[] list = dp.listFiles(ff);
            for (File fileName:list){
                System.out.println(fileName);
                i++;
            }

        }
        else
        {
            System.out.println("Input is not a directory");            
        }
        
        
        return i;
    }
        
}