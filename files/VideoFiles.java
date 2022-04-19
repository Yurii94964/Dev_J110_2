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
public class VideoFiles extends Files {
    private String descriptionOfTheContent;
    private Duration  duration;
    private SizePicture sizePictureVideo;

    public VideoFiles(String fileName, int size, String descriptionOfTheContent, Duration second, SizePicture sizePicture) {
        super(fileName, size);
        setDescriptionOfTheContent (descriptionOfTheContent);
        setDuration (second);
        setSizePictureVideo(sizePicture);
        this.fileFormat = "video";
    }
    @Override
    public void print(){
        super.print();
        System.out.println(descriptionOfTheContent + ", " + getDuration().getTimeMediaFile()+ ", "  + getSizePictureVideo().getSizePicture() + ".");
    }

    public SizePicture getSizePictureVideo() {
        return sizePictureVideo;
    }
  
    public void setSizePictureVideo(SizePicture sizePictureVideo) {
        if(sizePictureVideo == null)
            throw new IllegalArgumentException("размер картинки видео не может быть null");
        this.sizePictureVideo = sizePictureVideo;
    }

    public String getDescriptionOfTheContent() {
        return descriptionOfTheContent;
    }

    public void setDescriptionOfTheContent(String descriptionOfTheContent) {
        if(descriptionOfTheContent != null && descriptionOfTheContent.trim().isEmpty())
            throw new IllegalArgumentException("описание контента не может быть пустым");
        else if (descriptionOfTheContent == null)
            throw new IllegalArgumentException("описание контента не может быть null");
        this.descriptionOfTheContent = descriptionOfTheContent;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        if(duration == null)
            throw new IllegalArgumentException("продолжительность не может равняться null");
        this.duration = duration;
    }

   
    }
    
    

