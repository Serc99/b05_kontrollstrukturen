// b05_kontrollstruktur
// g_geschachteltes_if

public class ABCAnalyse2
{
   public static void main(String[] args)
   {
      char prioritaet = 'A';

      if(prioritaet == 'A')
      {
         System.out.println("Hoch");
      }
      else
      {
      }
         if(prioritaet == 'B')
         {
            System.out.println("Mittel");      
         }
         else
         {
            if(prioritaet == 'C')
            {
               System.out.println("Niedrig");
            }
            else
            {
               System.out.println("Unzulaessig");
            }         
         }
      }   
   }
}
