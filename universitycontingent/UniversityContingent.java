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
//класс контингент Вуза
public abstract  class  UniversityContingent {
    private String name; //переменная имя фамилия
    private String facultyName; //название факультета
    private Sex sex;
   
    
    public void print() {
        if(sex == Sex.M){
               System.out.print("This is " + name + " " +  Sex.M.toString() + (this instanceof Teachers ? " teaches" : " studies" ) + " at " + facultyName);
        }
        else
       System.out.print("This is " + name + " " +  Sex.F.toString() + " at "  + facultyName);
        
        
    }
     public static void printAll(UniversityContingent[] universityContingent ){
         
       for(int i = 0; i < universityContingent.length; i++ ){
          universityContingent [i].print();
       }
     
     }
 
    public UniversityContingent(String name,Sex sex,String facultyName) {
        setName(name);
        setSex(sex);
        setFacultyName(facultyName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
           
        this.name = name;
        
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        
        this.facultyName = facultyName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    
}
enum Sex{
    M("He"), F("She");

    private String SexStr;

    Sex(String SexStr){
        this.SexStr = SexStr;
    }
    @Override
    public String toString(){
        return SexStr;
    }
    
    
   
   
}
 
    
        
    
 

   
   
