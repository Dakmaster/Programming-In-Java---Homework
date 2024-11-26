//Written by Dakotah Jones on 12/10/23, Ch. 14 Exercise 6
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSandwich extends JFrame implements ItemListener {

    FlowLayout flow = new FlowLayout();
    JLabel companyName = new JLabel("Sublime Sandwich");
    JComboBox<String> mainBox = new JComboBox<String>();
    JLabel mainList = new JLabel("Main ingredient");
    JComboBox<String> breadBox = new JComboBox<String>();
    JLabel breadList = new JLabel("Breads");
    JTextField totPrice = new JTextField(12);
    int mainNum, breadNum;
    double[] mainPrices = {6.99, 7.99, 8.99};
    double sumPrice = mainPrices[0];
    double breadPrice = 0;
    double mainPrice = mainPrices[0];
    double[] breadPrices = {0, 0, 0};
    String output;

    public JSandwich() {
        
        Box box = Box.createVerticalBox();
        setLayout(flow);
        add(box);

        box.add(companyName, SwingConstants.CENTER);
        box.add(mainList);
        box.add(mainBox);
        box.add(breadList);
        box.add(breadBox);

        totPrice.setEditable(false);
        box.add(totPrice);

        mainBox.addItem("Chicken");
        mainBox.addItem("Beef");
        mainBox.addItem("Tuna");

        breadBox.addItem("White");
        breadBox.addItem("Rye");
        breadBox.addItem("Whole Wheat");

        mainBox.addItemListener(this);
        breadBox.addItemListener(this);

        totPrice.setText(breadBox.getSelectedItem() + " bread, " + mainBox.getSelectedItem().toString() + " at $" + mainPrices[mainBox.getSelectedIndex()] + "");
    }

    public static void main(String[] arguments) {
        JSandwich sandframe = new JSandwich();
        sandframe.setSize(240, 200);
        sandframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sandframe.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list) {
        
        if (list.getSource() == mainBox) {
            totPrice.setText(breadBox.getSelectedItem() + " bread, " + mainBox.getSelectedItem().toString() + " at $" + mainPrices[mainBox.getSelectedIndex()] + "");
        }
        
        if (list.getSource() == breadBox) {
            totPrice.setText(breadBox.getSelectedItem() + " bread, " + mainBox.getSelectedItem().toString() + " at $" + mainPrices[mainBox.getSelectedIndex()] + "");
        }
    }
}