/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

/**
 *
 * @author Юрий
 */
public class Files  {
    private String fileName;
    private int size;
    protected String fileFormat;
   

    public Files(String fileName, int size) {
        setFileName(fileName);
        setSize(size);
       
    }

    
    
    
    public static void printAll(Files [] files ){
        for(int i = 0; i < files.length; i++){
            files[i].print();
        }
        
    }
    public void print(){
        System.out.print("File name: " + fileName + ". SizeFile: " + size + " byte. " + " Details: " + fileFormat + ", " );
        
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        if(fileName != null && fileName.trim().isEmpty())
            throw new IllegalArgumentException("имя файла не должно быть пустым");
            else if (fileName == null)
            throw new IllegalArgumentException(" имя файла не должно быть null ");
        this.fileName = fileName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size <= 0)
            throw new IllegalArgumentException("размер не может быть меньше или равен нулю");
        this.size = size;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        if(fileFormat != null && fileFormat.trim().isEmpty())
            throw new IllegalArgumentException("формат файла не может быть пустым");
        else if (fileFormat == null) 
            throw new IllegalArgumentException("формат файла не может быть null");
        this.fileFormat = fileFormat;
    }
    
    
    
    

    
    
}
