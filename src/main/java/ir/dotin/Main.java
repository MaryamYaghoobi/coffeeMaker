package ir.dotin;

import ir.dotin.exception.InadequateInitialBalanceException;
import ir.dotin.exception.ViolatedUpperBoundException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        try {


            List<PaymentRecord> paymentRecords = PaymentFileHandler.createpaymentFile();
            List<PaymentRecord> depositBalances = BalanceFileHandler.createInitialBalanceFile(paymentRecords);
            List<Transaction> transactions = TransactionProcessor.prcessPaymentRecord(paymentRecords, depositBalances);
            TransactionFileHandler.createTransactionFile(transactions);
            BalanceFileHandler.createFinalBalanceFile(depositBalances);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InadequateInitialBalanceException e) {
            e.printStackTrace();
        }  catch (ViolatedUpperBoundException e) {
            e.printStackTrace();
        }
    }
}


