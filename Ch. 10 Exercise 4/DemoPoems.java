//Made by Dakotah Jones, on 11/26/23, Module 5, Chapter 10, Exercise 4
import java.util.*; public class DemoPoems {
public static void main(String[] args){         
Poem poem1 = new Poem("The Raven", 84);
Couplet poem2 = new Couplet("To you I Promise");
Limerick poem3 = new Limerick("There was an Old Man of Quebec");
Haiku poem4 = new Haiku("The light of a candle");
display(poem1);         
display(poem2);         
display(poem3);        
display(poem4);     
}      
public static void display(Poem p)
{         
System.out.println("Poem: " + p.getTitle() + " Lines: " + p.getLines());     
} 
}  
