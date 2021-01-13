package ir.dotin;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class PaymentFileHandler {

    static Path path = Paths.get("B://PaymentFile.txt");


    public static List<PaymentRecord> createpaymentFile() throws NumberFormatException, IOException, FileNotFoundException {
        Random random = new Random();
        final int depositRandom = random.nextInt(1000);
        final double amountRandom = random.nextInt(1000000 - 100000) + 100000;
        Files.createFile(path);
        FileOutputStream PaymentFile;

        PaymentFile = new FileOutputStream("B://PaymentFile.txt", true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(PaymentFile));
        int debtor = Integer.parseInt("debtor 1.10.1001.1" + "  " + amountRandom);
        bw.write(debtor);
        bw.newLine();
        for (int i = 1; i <= 1000; i++) {
            int creditor = Integer.parseInt("creditor  1.20.100." + depositRandom + " " + amountRandom);
            bw.write(creditor);
            bw.newLine();
        }

        bw.close();

        //   return null;


        return null;
    }
}