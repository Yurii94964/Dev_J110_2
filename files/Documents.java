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
public class Documents extends Files {
   
    private int numberOfPages;

    public Documents(String fileName, int size, int numberOfPages ) {
        super(fileName, size);
        
        setNumberOfPages(numberOfPages);
        this.fileFormat = "docx";
    }
    @Override
    public void print(){
        super.print();
        System.out.println(numberOfPages + " pages.");
          
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages <=0)
            throw new IllegalArgumentException("номер страницы не может быть меньше или равна нулю");
        this.numberOfPages = numberOfPages;
    }
    
    
    
}
