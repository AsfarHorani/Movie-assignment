/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie.assignement;

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays; 
/**
 *
 * @author Azfar
 */
public class MovieProgram {
    

      private String MovieName;
       private  double Rate;
        private LocalDate ReleaseDate;
         private Generes [] Gen;
        private Languages [] Lang;
        private Countries [] Count;
        
        public String getmoviename()
        {
         
          return MovieName;
        }
          public void setmoviename ( String MN)
          {
               
               this.MovieName=MN;
          }
          
          
             public double getrate()
        {
         
          return Rate;
        }
             
          public void setrate(double RT)
          {
               this.Rate=RT;
          }
          
          
             public LocalDate getDate()
        {
         
          return ReleaseDate;
        }
          public void setreleasedate (LocalDate D)
          {
               this.ReleaseDate=D;
          }
             public Generes[] getGen()
        {
         
          return Gen;
        }
          public void setgen(Generes[] G)
          {
               this.Gen=G;
          }
               public Languages[] getlanguage()
        {
         
          return Lang;
        }
          public void setlanguage(Languages[] L)
          {
               this.Lang=L;
          }
          
            public Countries[] getCountries()
        {
         
          return Count;
        }
          public void setcountry(Countries[] C)
          {
               this.Count=C;
          }
        public void getdetails()
        {
          System.out.println("Movie Name: "+MovieName+ "\nRating: "+Rate+ "\nRelease Date: "+ReleaseDate);
            
          System.out.print("Genres: ");
            for (int i = 0; i < Gen.length; i++) 
            {
                System.out.print(Gen[i]);
                if(i<Gen.length-1)
                   System.out.print(", ");
                else
                    System.out.println();
            }
            
            System.out.print("Languages: ");
             for (int i = 0; i < Lang.length; i++) 
            {
                System.out.print(Lang[i]);
                if(i<Lang.length-1)
                System.out.print(", ");
                else
                    System.out.println();
            }
             
             System.out.println("Rating: "+Rate);
             System.out.print("Countires: ");
               
             for (int i = 0; i < Count.length; i++) 
            {
                
                System.out.print(Count[i]);
                if(i<Count.length-1)
                System.out.print(", ");
                else
                    System.out.println();
            }
             
          
        }
        
       
}


   enum Generes
   {
       Action,
        Adventure,
        Animation,
        Biography,
        Comedy,
        Crime,
        Documentary,
        Drama,
        Family,
        Fantasy,
        History,
        Horror,
        Musical,
        Mystery,
        Romance,
        SciFi,
        Sport,
        Thriller,
        War,
        Western, 
   }

   enum Languages
   {
        Arabic,
        Azerbaijani,
        Bengali,
        Czech,
        Dutch,
        English,
        French,
        German,
        Greek,
        Hindi,
        Hungarian,
        Italian,
        Japanese,
        Javanese,
        Korean,
        Kurdish,
        Malay,
        Mandarin,
        Persian,
        Polish,
        Portuguese,
        Romanian,
        Russian,
        Spanish,
        Swedish,
        Thai,
        Turkish,
        Ukrainian,
        Urdu,
        Vietnamese,
        Zulu
   
   }
  
   enum Countries
   {
      Afghanistan,
        Albania,
        Algeria,
        Angola,
        Argentina,
        Australia,
        Austria,
        Bahamas,
        Bahrain,
        Bangladesh,
        Belarus,
        Belgium,
        Bolivia,
        Botswana,
        Brazil,
        Brunei,
        Bulgaria,
        BurkinaFaso,
        Burundi,
        Cambodia,
        Cameroon,
        Canada,
        Chad,
        Chile,
        China,
        Colombia,
        Comoros,
        CostaRica,
        Croatia,
        Cuba,
        Cyprus,
        CzechRepublic,
        Denmark,
        Ecuador,
        Egypt,
        ElSalvador,
        Estonia,
        Ethiopia,
        Finland,
        France,
        Gabon,
        Gambia,
        Georgia,
        Germany,
        Ghana,
        Greece,
        Greenland,
        Guatemala,
        Haiti,
        Honduras,
        HongKong,
        Hungary,
        Iceland,
        India,
        Indonesia,
        Iran,
        Iraq,
        Ireland,
        Israel,
        Italy,
        Jamaica,
        Japan,
        Jordan,
        Kazakhstan,
        Kenya,
        Kosovo,
        Kuwait,
        Latvia,
        Lebanon,
        Liberia,
        Libya,
        Liechtenstein,
        Lithuania,
        Luxembourg,
        Macedonia,
        Madagascar,
        Malawi,
        Malaysia,
        Maldives,
        Mali,
        Malta,
        Mauritius,
        Mexico,
        Moldova,
        Monaco,
        Mongolia,
        Montenegro,
        Morocco,
        Mozambique,
        Namibia,
        Nepal,
        Netherlands,
        NewZealand,
        Nicaragua,
        Niger,
        Nigeria,
        NorthKorea,
        Norway,
        Oman,
        Pakistan,
        Palestine,
        Panama,
        Paraguay,
        Peru,
        Philippines,
        Poland,
        Portugal,
        PuertoRico,
        Qatar,
        Romania,
        Russia,
        Rwanda,
        SaudiArabia,
        Senegal,
        Serbia,
        Seychelles,
        SierraLeone,
        Singapore,
        Slovakia,
        Slovenia,
        Somalia,
        SouthAfrica,
        SouthKorea,
        SouthSudan,
        Spain,
        SriLanka,
        Sudan,
        Swaziland,
        Sweden,
        Switzerland,
        Syria,
        Taiwan,
        Tanzania,
        Thailand,
        Togo,
        Tonga,
        Tunisia,
        Turkey,
        Uganda,
        Ukraine,
        UnitedArabEmirates,
        UnitedKingdom,
        UnitedStatesofAmerica,
        Uruguay,
        Uzbekistan,
        VaticanCity,
        Venezuela,
        Vietnam,
        Yemen,
        Zambia,
        Zimbabwe
   }
    

