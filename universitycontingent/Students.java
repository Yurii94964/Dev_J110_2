/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitycontingent;

/**
 *
 * @author Юрий
 */
public class Students extends UniversityContingent {
    private String stageOfStudy;
    private int courseNumber;

     
    
      public Students(String name,Sex sex,String facultyName,String stageOfStudy, int courseNumber) {
        super(name,sex,facultyName );
        setStageOfStudy(stageOfStudy);
        setCourseNumber(courseNumber);
      }
    
    public String getStageOfStudy() {
        return stageOfStudy;
    }

    public void setStageOfStudy(String stageOfStudy) {
        this.stageOfStudy = stageOfStudy;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    } 
    
   @Override
   public void print(){
       super.print();
       System.out.println((getSex() == Sex.M  ? " He" : " She") + " is " + courseNumber + "`th year " + stageOfStudy + " student.");
       
   }
        
}
enum Leval {
    Bachelor("Bachelor"),
    Master("Master");

    private String LevalStr;

    Leval(String LevalStr){
        this.LevalStr = LevalStr;
    }
   

}


    
 
         
     
   
    


