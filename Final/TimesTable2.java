public class TimesTable2
{
   public static void main (String[] args) {
      int mult;
      // print main table
      for (int i = 1; i <= 9; i++) {
         //System.out.print(i);
         //if (i < 10) System.out.print(" :");
         //else System.out.print(":");
         for (int j = 1; j <= 10; j++) {
            mult = i*j;
            System.out.print(" " + mult);
            if (mult < 10) System.out.print("  ");
            else if (mult < 100) System.out.print(" ");
         }
         System.out.println();
      }
   } // end of main
}