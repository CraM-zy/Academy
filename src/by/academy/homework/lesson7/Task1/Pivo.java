package by.academy.homework.lesson7.Task1;

public class Pivo extends Product
{
    double degree;

    public Pivo(String type, String prod_name, double price, int quan, double degree)
    {
        super(type,prod_name,price,quan);
        this.degree=degree;
    }

    public Pivo(String alco, String oxota, double v, int i) {
        super();
    }

    public double getDegree()
    {
        return degree;
    }

    public void setDegree(double degree)
    {
        this.degree=degree;
    }

    public double discount()
    {
        if(quan>10)
        {
            return 0.85;
        }
        return 1;
    }

   /* public double Sale_beer()
    {
        if(prod_name.contains("A"))
            return 0.9;
        return 1;
    }

    public double Sale()
    {
        if(quan * price > 1000)
        {
            return 0.8;
        }
        return 1;
    }*/

}
