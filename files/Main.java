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
public class Main {
    public static void main(String[] args ) {
        
        
        
        
       
        Duration audio = new Duration(5475);
        Duration video = new Duration(60 * 60 + 48 * 60 + 8);
        SizePicture sizeVideo = new SizePicture(640,352);
        SizePicture sizeImage = new SizePicture(1024,3072);
        
        Files [] files = new Files [4];
       files [0] = new Documents("j110-lab2-hiers.docx", 23212, 8);
       files [1] = new StaticImagesFiles("spb-map.png", 1703527,sizeImage);
       files [2] = new MultimediaFiles("06-PrettyGirl.mp3" ,7893454,"Eric Clapton, Pretty Girl", audio);
       files [3] = new VideoFiles("BackToTheFuture1.avi",1470984192, "Back to the future I, 1985",video,sizeVideo);
       Files.printAll(files);
        
    }
    
}
