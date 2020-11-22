package by.academy.homework.lesson7.Task1;
import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public static void main(String...args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the name of seller: ");
        String name1 = scan.next();
        System.out.println("Input the name of buyer: ");
        String name2 = scan.next();
        System.out.println("Input buyer's money: ");
        int bCash = scan.nextInt();

        Person pers = new Person();
        pers.ValidEmail();
        pers.ValidPhone();
        pers.dateBir();

        Person seller = new Person(name1, 0.00);
        Person buyer = new Person(name2, bCash);

        Product[] products = new Product[5];

        Deal deal = new Deal(products, buyer, seller, "14.11");
        System.out.println("Do you want to add new product? 1 - yes; 2 - no: ");
        int yes = scan.nextInt();

        while (yes == 1)
        {
            System.out.println("What product are you want to buy: 1 - BURN; 2 - BOOK; 3 - PIVO; ");
            int num = scan.nextInt();
            switch (num)
            {
                case 1:
                    System.out.println("How mach: ");
                    int colB = scan.nextInt();
                    deal.addProduct(new Burn("ENERGY", "BURN", 5.00, colB, "RED"));
                    break;
                case 2:
                    System.out.println("How mach? ");
                    int colBoo = scan.nextInt();
                    deal.addProduct(new Book("BOOK", "STORY", 25.00, colBoo, "LITRES"));
                    break;
                case 3:
                    System.out.println("How mach? ");
                    int colP = scan.nextInt();
                    deal.addProduct(new Pivo("ALCO", "OXOTA", 3.00, colP, 6.8));
                    break;
            }

            System.out.println("Next product? 1 - yes; 2 - no: ");
            yes = scan.nextInt();
        }


        deal.printProducts();
        System.out.println(" Do eou want to delete product? 1 - yes; 2 - no: ");
        int am = scan.nextInt();

        while (am == 1) {
            System.out.println("What you want to delete: 1 - BURN; 2 - BOOK; 3 - PIVO ");
            int ame = scan.nextInt();

            deal.deleteProduct(ame);
            System.out.println("DELETE? 1 - yes; 2- no: ");
            am = scan.nextInt();
        }

        System.out.println(" ");
        deal.printProducts();
        deal.deal();

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        System.out.println("Need date: " + today.plusDays(10));

    }
}
