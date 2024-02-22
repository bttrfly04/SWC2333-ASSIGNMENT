
/**
 * Program Description : to manage flower inventory
 * Programmer : Abd Rasheed
 * Date : 22/2/2024
 */
public class Flower
{
    // Declaration of the instance variables 
    public String name;
    public String colour;
    public double price;
    public int quantity;
    
    //Constructor with parameter
    public Flower(String name, String colour, double price, int quantity)
    {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.quantity = quantity;
    }
    //Constructor without parameter
    public Flower()
    {
        this.name = "";
        this.colour = "";
        this.price = 0;
        this.quantity = 0;
    }
    
    //retrievers(accessors)for each data member
    public String getName()
    {
        return name;
    }
    
    public String getColour()
    {
        return colour;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    //Mutators(setters) sets all data members
    public void setName (String name)
    {
        this.name = name;
    }
    
    public void setColour (String colour)
    {
        this.colour = colour;
    }
    
    public void setPrice (double price)
    {
        this.price = price;
    }
    
    public void setQuantity (int quantity)
    {
        this.quantity = quantity;
    }
    
    //toString() method:to return a string
    public String toString()
    {
        return "Name:" + name + "\nColour:" + colour + "\nPrice" + price + "\nQuantity" + quantity;
    }
    
}// end of class
