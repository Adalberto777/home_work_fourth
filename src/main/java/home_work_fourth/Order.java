package home_work_fourth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static home_work_fourth.Buyer.buyers;
import static home_work_fourth.Item.items;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    Buyer nameOfBuyer;
    Item nameOfItem;
    private int volume;

    public static Order buy(Buyer who, Item what, int howMuch) {
        if (!isInArray(buyers, who))
            throw new BuyerException("Unknown customer: " + who);
        if (!isInArray(items, what))
            throw new ItemException("Unknown item: " + what);
        if (howMuch < 0 || howMuch > 100)
            throw new AmountException("Incorrect amount: " + howMuch);
        return new Order(who, what, howMuch);
    }

    private static boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(o)) return true;
        return false;
    }


}
