public class grades {

public class grades {

    public static  char grade_To_Letter(int percentage){
          
              char grade_Char ;
        
         if (percentage >= 90)
      {
         grade_Char = 'A';
      }
      else if (percentage >= 80)
      {
         grade_Char = 'B';
      }
      else if (percentage>= 70)
      {
         grade_Char = 'C';
      }
      else if (percentage >= 60)
      {
         grade_Char= 'D';
      }
      else
      {
         grade_Char = 'F';
      }
     
      return grade_Char;
       }
      
public  static void main(String[] args) {
      int percentage= 66 ;
   System.out.print(percentage+" ==> "+grade_To_Letter(percentage));
    
  }}