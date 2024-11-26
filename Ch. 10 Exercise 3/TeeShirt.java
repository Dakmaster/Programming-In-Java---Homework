//Made by Dakotah Jones, on 11/26/23, Module 5, Chapter 10, Exercise 3

public class TeeShirt {

private int orderNumber;
private String size;
private String color;
private double price;
public void setOrderNumber(int num) {
this.orderNumber = num;
}

public void setSize(String sz) {
this.size = sz;
if (size.equals("XXL") || size.equals("XXXL"))
price = 22.99;
else
price = 19.99;
}

public void setColor(String color) {
this.color = color;
}
public int getOrderNumber() {
return orderNumber;
}
public String getSize() {
return size;
}
public String getColor() {
return color;
}
public double getPrice() {
return price;
}
}