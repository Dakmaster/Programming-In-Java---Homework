//Written by Dakotah Jones on 12/10/23, Ch. 14 Exercise 3
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFacts extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JButton b = new JButton("Press to change fact");
   JLabel stars = new JLabel("**********************************************");
   JLabel f1 = new JLabel("The U.S. Civil War started in 1860 and ended in 1865.   ");
   JLabel f2 = new JLabel("1 + 1 = 2.                                              ");
   JLabel f3 = new JLabel("The longest reigning British monarch was Queen Victoria.");
   JLabel f4 = new JLabel("Magna Carta took place in 1215.                         ");
   JLabel f5 = new JLabel("The U.S. Declaration of Independence was signed in 1776.");
   int counter = 0;
   public JFacts()
   {
      super("Facts");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(b);
      add(stars);
      add(f1);
      b.addActionListener(this);
   }
   public static void main(String[] args)
   {
      JFacts rFrame = new JFacts();
      rFrame.setSize(400,200);
      rFrame.setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      ++counter;
      if(counter == 5)
        counter = 0;
      if(counter == 1)
      {
          remove(f1);
          add(f2);
      }
      else
         if(counter == 2)
         {
             remove(f2);
             add(f3);
         }
         else
             if(counter == 3)
             {
                  remove(f3);
                  add(f4);
             }
             else
                if(counter == 4)
                {
                   remove(f4);
                   add(f5);
                }
                else
                {
                    remove(f5);
                    add(f1);
                }
                   
      validate();
      repaint();
  }

}