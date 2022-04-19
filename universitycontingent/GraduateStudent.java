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
public class GraduateStudent extends UniversityContingent {
    private String dissertationTopic; //Тема диссертации

   public GraduateStudent(String name,Sex sex,String facultyName, String dissertationTopic ) {
        super(name, sex, facultyName);
        setDissertationTopic(dissertationTopic);     
    }
    
    public String getDissertationTopic() {
        return dissertationTopic;
    }

    public void setDissertationTopic( String dissertationTopic ) {
        this.dissertationTopic = dissertationTopic;
    }

    @Override
    public void print(){
        super.print();
        System.out.println((getSex() == Sex.M ? " His" : " her") + " thesis title is " + dissertationTopic);
    }
   

    

    
  
    
    
}
