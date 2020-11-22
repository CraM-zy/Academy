package by.academy.homework.lesson7.Task1;

public class Book  extends Product
{
    String edition;

    public Book(String type, String prod_name, double price, int quan, String edition)
    {
        super(type,prod_name,price,quan);
        this.edition=edition;
    }
    public String getEdition()
    {
        return edition;
    }

    public void setEdition(String edition)
    {
        this.edition=edition;
    }

    public double discount()
    {
        if(quan * price > 1000)
        {
            return 0.8;
        }
        return 1;
    }

}
