public class Block
{
   public static void main (String[] args)
   {
      {
         int i = 42;               // Eine Variable gilt nur innerhalb des Blocks,
                                   // in dem sie deklariert wurde. ( Eine Variable, 
                                   // kann auch im Kopf eines Blocks fuer diesen
                                   // Block deklariert werden.
      }
      // System.out.println(i);    // Geht nicht.
                                   // Ist ausserhalb des Blocks.

         int j = 43;

         {
            System.out.println(j); // Geht!
                                   // Ist in einem "Unterblock".
         }
   }
}

