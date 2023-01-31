package com.rickotb.systembank.bl;

import com.rickotb.systembank.da.entity.Account;
import com.rickotb.systembank.da.entity.TransactionHistory;
import com.rickotb.systembank.ui.Menu;

public class ViewTransaction {
    public static void viewTransaction(Account userName){
        int i = 0;
        for(String s:TransactionHistory.getInstance().getTransaction()){
            i++;
            System.out.println(i + " " + s);
            System.out.println("___________________________________________________");
        }
        Menu.startMenu(userName);
    }
}
