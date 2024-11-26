//Made by Dakotah Jones, on 11/26/23, Module 5, Chapter 11, Exercise 3
public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
   public void setAddress(String a)
   {
      boolean hasDigit = false;
      address = a;
      for(int x = 0; x < a.length(); ++x)
         if(Character.isDigit(a.charAt(x)))
            hasDigit = true;
      if(hasDigit)
         rate = 15.00;
      else
      {
         rate = 0;
         System.out.print("\nAddress must contain a digit   ");
      }
   }

}
