package by.academy.homework.lesson7.Task1;

public class Burn extends Product
{
    String color;

    public Burn(String type, String prod_name, double price, int quan, String color)
    {
        super(type,prod_name,price,quan);
        this.color=color;
    }

    public Burn(String energy, String burn, double v, int i) {
        super();
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color=color;
    }

    public double discount()
    {
        if(quan>10)
        {
            return 0.85;
        }
        return 1;
    }

   /* public double Sale()
    {
        if(quan * price>1000)
        {
            return 0.8;
        }
        return 1;
    }*/
}

