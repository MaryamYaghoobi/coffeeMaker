/*
package ir.dotin;

import ir.dotin.exception.InadequateInitialBalanceException;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;


public class ioInfo {


    private static List<Deposit> deposits;
    //  private static List Deposit;
    // private static Object List;
    // private static Object List;

    public static List<Deposit> getDeposits() {
        return deposits;
    }
//PaymentFileHandler
   */
/* static Path path = Paths.get("B://PaymentFile.txt");
    Random random = new Random();
    final int depositRandom = random.nextInt(1000);
    final double amountRandom = random.nextInt(1000000 - 100000) + 100000;*//*

//======================================================================
    //این قسمت درسته
    // فایل ایجاد میشه
    // میخونه میریزه تو آرایه

   */
/* public ioInfo fromFile() throws NumberFormatException,IOException,FileNotFoundException{

            Files.createFile(path);
            FileOutputStream PaymentFile;

                PaymentFile = new FileOutputStream("B://PaymentFile.txt", true);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(PaymentFile));

                bw.write(Integer.parseInt("debtor 1.10.1001.1" + " " + amountRandom));
                bw.newLine();
                for (int i = 1; i <= 1000; i++) {
                    bw.write(Integer.parseInt("creditor  1.20.100." + depositRandom + " " + amountRandom));
                    bw.newLine();
                }

                bw.close();

        return null;
    }*//*

*/
/*
    public static List<Deposit> readDepositsFromFile()  throws IOException{

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
                }


            return deposits; }*//*


//======================================================================
        // فایل موجودی

        //public int readBalance (int x)
      */
/*  private static List<Deposit> readBalance(Deposit deposit) throws InadequateInitialBalanceException,ClassNotFoundException,IOException {
            Path pathInvent = Paths.get("B://InventoryFile.txt");
                Files.createFile(pathInvent);
                FileOutputStream InventoryFile = new FileOutputStream("B://InventoryFile.txt", true);
                BufferedReader readerInvent = null;

                readerInvent = Files.newBufferedReader(pathInvent, Charset.forName("UTF-8"));


                String currentLine = null;

                currentLine = readerInvent.readLine();

                String[] ingredients = currentLine.split("\t");
                if (ingredients[1].matches("^[0-9].*$")) {
                    deposit.setDepositNumber((ingredients[1].trim()));
                    deposit.setInitalBalance(Integer.parseInt(ingredients[2].trim()));
                    deposits.add(deposit);


                currentLine = readerInvent.readLine();
                return deposits;}
                else{
                    throw new InadequateInitialBalanceException("Not enough balance!");

         //   return deposits;

        }

    }
}

*/
