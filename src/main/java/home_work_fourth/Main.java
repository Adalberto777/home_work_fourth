package home_work_fourth;

import static home_work_fourth.Buyer.buyers;
import static home_work_fourth.Item.items;

public class Main {
    public static void main(String[] args) {



        Order[] orders = new Order[5];

        Object[][] info = {
                {buyers[0], items[0], 1}, //good
                {buyers[1], items[1], -1}, //bad amount -1
                {buyers[0], items[2], 150}, //bad amount >100
                {buyers[1], new Item("Flower", 10), 1}, //no item
                {new Buyer("Fedor", 40, "+3-444-555-66-77"), items[3], 1}, //no customer
                };
        int capacity = 0;
        int i = 0;
        while (capacity != orders.length - 1 || i != info.length) {
            try {
                orders[capacity] = Order.buy((Buyer) info[i][0], (Item) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (ItemException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders[capacity++] = Order.buy((Buyer) info[i][0], (Item) info[i][1], 1);
            } catch (BuyerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Orders made: " + capacity);
            }
            ++i;
        }

        }
}
