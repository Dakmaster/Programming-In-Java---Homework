//Made by Dakotah Jones, on 11/26/23, Module 5, Chapter 11, Exercise 3
public abstract class NewspaperSubscription
{
   protected String name;
   protected String address;
   protected double rate;
   public String getName()
   {
      return name;
   }
   public void setName(String n)
   {
      name = n;
   }
   public String getAddress()
   {
      return address;
   }
   public double getRate()
   {
      return rate;
   }
   public abstract void setAddress(String s);
}
