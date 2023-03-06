import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    static ArrayList<Stock> list = new ArrayList<>();

    public void getStockData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stocks: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter stock name, number of shares and share price: ");
            String name = scanner.next();
            int numberOfShares = scanner.nextInt();
            int price = scanner.nextInt();
            Stock stock = new Stock(name, numberOfShares, price);
            list.add(stock);

        }
    }

    public void printReport() {

        int totalValue = 0;

        while (!list.isEmpty()) {
            Stock folio = list.remove(0);
            totalValue += folio.getValue();
            System.out.println(
                    "name of the share : " + folio.getName() + "\n"
                            + "number of shares  : " + folio.getNumberOfShares() + "\n"
                            + "price             : " + folio.getPrice() + " \n"
                            + "value of the " + folio.getName() + " :" + folio.getValue());
        }
        System.out.println("\nTotal value is: " + totalValue);
    }
}

