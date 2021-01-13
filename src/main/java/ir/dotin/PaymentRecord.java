package ir.dotin;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PaymentRecord extends PaymentFileHandler {
    public static List<Deposit> readDepositsFromFile() throws IOException {

        //   Logger logger = Logger.getLogger("IoInfoLog");
        List<Deposit> deposits = new ArrayList<>();
        Deposit deposit = new Deposit();
        BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));
        String currentLine = reader.readLine();
        while (currentLine != null) {
            String[] ingredients = currentLine.split("\t");
           if (ingredients[1].matches("^[0-9].*$")) {

                deposit.setDepositType(ingredients[0].trim());
                deposit.setDepositNumber((ingredients[1].trim()));
                deposit.setInitalBalance(Integer.parseInt(ingredients[2].trim()));
                deposits.add(deposit);
            }
            currentLine = reader.readLine();
       // }


         }
        return deposits;
    }
}
