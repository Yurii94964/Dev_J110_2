/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitycontingent;


public class Teachers extends UniversityContingent {
    private String nameOfSpecialty;
    private AcademicDegree degree; //ученая степень
    
    
    
    
    public Teachers(String name,Sex sex,String facultyName, AcademicDegree degree, String nameOfSpecialty) {
        super(name, sex, facultyName);
        setNameOfSpecialty(nameOfSpecialty);
        setDegree(degree);
    }

    public String getNameOfSpecialty() {
        return nameOfSpecialty;
    }

    public void setNameOfSpecialty(String nameOfSpecialty) {
        this.nameOfSpecialty = nameOfSpecialty;
    }

    public AcademicDegree getDegree() {
        return degree;
    }

    public void setDegree(AcademicDegree degree) {
        this.degree = degree;
    }
    @Override
    public void print(){
        super.print();
        if(getSex() == Sex.M){
            System.out.print(" He");
        }
        else
            System.out.print(" She");
        
         
        System.out.println( " has " + degree + " degree in " + nameOfSpecialty);
    }
    


}
enum AcademicDegree{
    candidateOfSciences ("MSc"), doctorOfSciences ("MSc"),PHD ("PhD");
    private String Degree;

    AcademicDegree(String Degree){
        this.Degree = Degree;
   
   
    }
    @Override
    public String toString(){
        return Degree;
    }
    
}
    
    
    
