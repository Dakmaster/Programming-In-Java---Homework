//Made by Dakotah Jones, on 11/26/23, Module 5, Chapter 11, Exercise 3
public class DemoSubscriptions
{
   public static void main(String args[])
   {
      PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
      OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
      PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
      OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();
      pnsGood.setName("Nguyen");
      pnsGood.setAddress("2501 N. Ave.");
      display(pnsGood);
      pnsBad.setName("Jones");
      pnsBad.setAddress("Spruce St.");
      display(pnsBad);      
      onsGood.setName("James");
      onsGood.setAddress("James@gmail.com");
      display(onsGood);
      onsBad.setName("Lee");
      onsBad.setAddress("Pine Street");
      display(onsBad); 
   }
   public static void display(NewspaperSubscription n)
   {
      System.out.println("Name: " + n.getName() + "   Address: " +
         n.getAddress() + "   Rate: " + n.getRate() + "\n");
   }
}
