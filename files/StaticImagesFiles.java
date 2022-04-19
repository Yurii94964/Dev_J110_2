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
public class StaticImagesFiles extends Files {
    private SizePicture sizePictureImage;

    public StaticImagesFiles(String fileName, int size, SizePicture sizePicture) {
        super(fileName, size);
        setSizePictureImage(sizePicture);
        this.fileFormat = "image";
        
    }
    @Override
    public void print(){
        super.print();
        System.out.println(getSizePictureImage().getSizePicture() + ".");
    }

    public SizePicture getSizePictureImage() {
        return sizePictureImage;
    }

    public void setSizePictureImage(SizePicture sizePictureImage) {
         if (sizePictureImage == null )
             throw new IllegalArgumentException("размер картинки не может равняться null");
        this.sizePictureImage = sizePictureImage;
    }

   
   
    
}
