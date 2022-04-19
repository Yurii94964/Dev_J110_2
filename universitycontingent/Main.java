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
public class Main {
    public static void main(String[] args) {
      
                                                          
       UniversityContingent[] universityContingent = new UniversityContingent[6];
                                        
       universityContingent [0] = new Teachers("Ronald Turner.",Sex.M, "Computer science." ,AcademicDegree.PHD, "Programming paradigms.");
       universityContingent [1] = new Teachers("Ruth Hollings.", Sex.F, "Jurisprudence.",AcademicDegree.candidateOfSciences, "Domestic arbitration.");
       universityContingent [2] = new Students("Leo Wilkinson.",Sex.M, "Computer science.", "Bachelor", 3);
       universityContingent [3] = new Students("Anna Cunningham.",Sex.F,"World economy.", "Bachelor", 1);
       universityContingent [4] = new Students("Jill Lundqvist.",Sex.F, "Jurisprudence.", "Master", 1);
       universityContingent [5] = new GraduateStudent("Ronald Correa.",Sex.M, "Computer science.", "\"Design of a functional programming language.\"");
       UniversityContingent.printAll(universityContingent);
    }
   
}
