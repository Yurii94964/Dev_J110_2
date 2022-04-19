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
public class MultimediaFiles extends Files {
    private String descriptionOfTheContent;
    private Duration duration;

    public MultimediaFiles(String fileName, int size, String descriptionOfTheContent, Duration second ) {
        super(fileName, size);
        setDescriptionOfTheContent(descriptionOfTheContent);
        setDuration(second);
        this.fileFormat = "audio";
    }
    @Override
    public void print(){
        super.print();
        System.out.println(descriptionOfTheContent + ", " + getDuration().getTimeMediaFile() + ".");
    }

    public String getDescriptionOfTheContent() {
        return descriptionOfTheContent;
    }

    public void setDescriptionOfTheContent(String descriptionOfTheContent) {
        if(descriptionOfTheContent != null && descriptionOfTheContent.trim().isEmpty())
            throw new IllegalArgumentException("описание содержащегося в файле контента не может быть пустым");
            else if(descriptionOfTheContent == null )
                    throw new IllegalArgumentException("описание содержащегося в файле контента не может быть равно null");
                  
        this.descriptionOfTheContent = descriptionOfTheContent;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        if(duration == null)
            throw new IllegalArgumentException("продолжительность не может быть null");
        
        this.duration = duration;
    }
    
    
    
}
