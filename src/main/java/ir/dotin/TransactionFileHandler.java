package ir.dotin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TransactionFileHandler {
    //createTransactionFile
    public static void createTransactionFile(List<Transaction> list) throws IOException {


        String debtorDepositNumber = "";
        String resultText = "";
        BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.txt"));
        for (Deposit deposit : list) {
            if ("debtor".equals(deposit.getDepositType()))
                debtorDepositNumber = deposit.getDepositNumber();
            else
                resultText += debtorDepositNumber + "\t" + deposit.getDepositNumber() + "\t" + deposit.getInitialBalance() + "\n";
        }
        writer.write(resultText);
        writer.newLine();
        writer.close();
    }
}
