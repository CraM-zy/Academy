package by.academy.homework.lesson7.Task1;
import java.time.LocalDate;

public class Deal
{
    public final static int PROD_SIZE = 2;
    Product[] prod;
    String date;
    Person bayer;
    Person seller;
    private int productCounter;
    double calc;

    public Deal(Product[] prod, Person bayer, Person seller, String date)
    {
        super();
        this.prod=prod;
        this.bayer=bayer;
        this.date=date;
        this.seller=seller;
    }

    public Deal()
    {
        super();
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date=date;
    }

    public Person getBayer()
    {
        return bayer;
    }

    public void setBayer(Person bayer)
    {
        this.bayer=bayer;
    }

    public Person getSeller()
    {
        return seller;
    }

    public void setSeller(Person seller)
    {
        this.seller=seller;
    }

    public Product[] getProd()
    {
        return prod;
    }

    public void setProd(Product[] prod)
    {
        this.prod=prod;
    }

    public double result()
    {
        double summa = 0;
        for (Product product: prod)
        {
            summa += product.getPrice()*product.getQuan();
        }
        if (summa >=bayer.getCash())
        {
            System.out.println("Недостаточно средств! Сделка не состоялась.");
        }
        else
        {
            printBill();
        }
        return 0;
    }

    private void printBill()
    {
        LocalDate today = LocalDate.now();
        System.out.println("Сделка завершена! ");
        System.out.println(" ");
        System.out.println("Дата сделки: " + today);
        for (Product product: prod)
        {
            double all_price = product.getPrice() * product.getQuan();
            double summ = 0;
            summ += all_price;
            System.out.println(product.getProd_name()+ " " + "Цена:" + product.calcFinalPrice() + " Количество:" + product.getQuan());
            System.out.println("Сумма всей покупки составляет: " + all_price);
            bayer.setCash(bayer.getCash() - summ);
            seller.setCash(seller.getCash() + summ);
            System.out.println("Деньги покупателя " + bayer.getCash());
            System.out.println("Деньги продавца " + seller.getCash());
            System.out.println(" ");
        }
    }

    public void addProduct(Product product)
    {

        if (prod == null) {
            prod = new Product[PROD_SIZE];
        } else {
            if (productCounter + 1 > prod.length)
            {
                expandProductArray();
            }
        }
        prod[productCounter++] = product;
    }

    public void deleteProduct(int index) {

        if (index > prod.length || index < 0)
        {
            System.out.println("Index of bound");
            return;
        }
        if (productCounter != index) {
            System.arraycopy(prod, index + 1, prod, index, prod.length - index - productCounter);
        }
        prod[productCounter] = null;
        productCounter--;
    }

    private void expandProductArray() {
        Product[] tempArray = new Product[prod.length * 2 + 1];
        System.arraycopy(prod, 0, tempArray, 0, prod.length);
        prod = tempArray;
    }

    public void printProducts()
    {
        double cal = 0;
        for (int i = 0; i < productCounter; i++) {

            Product p = prod[i];
            cal += p.calcFinalPrice();
            System.out.println("Name: " + p.getProd_name());
            System.out.println("Type: " + p.getType());
            System.out.println("Total Price: " + p.calcFinalPrice());
            System.out.println(" ");
        }
        calc = cal;
    }

    public void deal()
    {
        System.out.println("The sum of deal: " + calc);
        bayer.setCash(bayer.getCash() - calc);
        seller.setCash(seller.getCash() + calc);
        System.out.println("Buyer's money: " + bayer.getCash());
        System.out.println("Seller's money: " + seller.getCash());

    }
}
