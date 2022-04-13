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
public  class Duration  {
    
   private int second;
   private String timeMediaFile;
   
  
    public Duration(int second) {
        
        setSecond(second);
    }
    
    public  void setSecond(int second) {
        if(second <= 0)
            throw new IllegalArgumentException("длительность файла не может быть отрицательной или равна 0");
        
        this.second = second;
    } 
     public String getTimeMediaFile() {
        timeMediaFile = String.format("%02d:%02d:%02d",second/3600,second/60%60,second%60);
        return timeMediaFile;         
   
    }
    
}
