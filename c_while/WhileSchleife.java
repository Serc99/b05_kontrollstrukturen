// b05_kontrollstrukturen
// c_while

import java.io.*; 

public class WhileSchleife
{
   public static void main(String[] Args) throws Exception
   {
      InputStreamReader eingabeLeser;
      BufferedReader    gepufferterLeser;
      String            eingabeText = "";
      int               eingabeZahl = 0;

      boolean test = 1 == 2;
      System.out.println(test);

      eingabeLeser     = new InputStreamReader(System.in); 
      gepufferterLeser = new BufferedReader(eingabeLeser);

      // Die while-schleife enthaelt in ihrem Kopf eine Bedingung.
      // Eine Bedingung ist ein Ausdruck der einen Wahrheitswert hat (true oder false, Typ: boolean)
      // Diese bedingung wird VOr jedem Schleifendurchlauf geprueft.
      // Wenn sie erfuellt ist, wird der Schleifenrumpf durchlaufen.
      // Wenn nicht, findet keine Wiederholung (mehr) statt.
      // != bedeutet ungleich.

      while(eingabeZahl != 4711)
      {
         System.out.println("Bitte die PIN eingeben: ");

         eingabeText = gepufferterLeser.readLine();
         eingabeZahl = Integer.parseInt(eingabeText);
      }
      
      System.out.println();
      System.out.println("Eingegeben wurde: " + eingabeZahl);
   }
}
