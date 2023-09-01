package home_work_fourth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buyer {
    private String fullName;
    private int age;
    private String telephoneNumber;

    final static Buyer[] buyers = {
            new Buyer("Ivan", 20, "+1-222-333-44-55"),
            new Buyer("Petr", 30, "+2-333-444-55-66"),
    };
}
