public class GRADES {

     public static void main(String []args){
        
        double g ;
        char gch ;
        g=77;
         if (g >= 90)
      {
         gch = 'A';
      }
      else if (g >= 80)
      {
         gch = 'B';
      }
      else if (g >= 70)
      {
         gch = 'C';
      }
      else if (g >= 50)
      {
         gch = 'D';
      }
      else
      {
         gch = 'F';
      }
      System.out.println("The grade is "+gch); }
}