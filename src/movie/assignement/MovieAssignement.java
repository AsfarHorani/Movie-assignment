
package movie.assignement;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays; 

public class MovieAssignement {
    
  

    
    public static void main(String[] args)
    
    {
      MovieProgram Avengers = new MovieProgram();
      Avengers.setmoviename("Avengers Assemble");
      
      Avengers.setreleasedate(LocalDate.of(2012, 5, 25));
     
       Generes []S = new Generes [3];
       S[0]=Generes.Action;
       S[1]=Generes.SciFi;
       S[2]=Generes.Adventure;
       Avengers.setgen(S);
       
       Languages []l = new Languages [2];
       l[0]=Languages.English;
         l[1]=Languages.Urdu;
         Avengers.setlanguage(l);
        Avengers.setrate(8.9);
        
        Countries [] M = new Countries[2];
        M[0]=Countries.Pakistan;
        M[1]=Countries.India;
        Avengers.setcountry(M);
       
       Avengers.getdetails();
      
       
     
       
    }
       
      
     
      
  
    }


    




