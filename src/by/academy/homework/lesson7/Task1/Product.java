package by.academy.homework.lesson7.Task1;

public abstract class Product {
    String type;
    String prod_name;
    double price;
    int quan;

    public Product(String type, String prod_name, double price, int quan)
    {  super();
       this.price=price;
       this.prod_name=prod_name;
       this.type=type;
       this.quan=quan;
    }

    public Product()
    {
        super();
    }

    public String getType() {
        return prod_name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public double calcFinalPrice()
    {

        return quan * price * discount();
    }

    public abstract double discount();
}

