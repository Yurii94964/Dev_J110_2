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
public class SizePicture {
    private int width;
    private int height;
    private String sizePicture;

    public SizePicture(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        if(width <= 0)
            throw new IllegalArgumentException("ширина не может быть меньше или равна нулю");
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        if(height <= 0)
            throw new IllegalArgumentException("высота не может быть меньше или равна нулю");
          
        this.height = height;
    }
      public int getHeight() {
        return height;
    }

    public String getSizePicture() {
        sizePicture = width + "x" + height;
        return sizePicture;
    }
    
    
    
   
   
   
   }
  
      
     
    

   
    
    

