package com.rickotb.systembank.da;

import com.rickotb.systembank.da.entity.Account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AccountList {

   public Account vasyaAccount = new Account(
            new ArrayList<>(Arrays.asList(
                    new Account.Card("5168 7559 5168 5222", 200),
                    new Account.Card("4149 4993 7464 0884", 1200)))
            , "Vasya");

    public Account mishaAccount = new Account(
            new ArrayList<>(Arrays.asList(
                    new Account.Card("5168 2223 5412 0283", 2500),
                    new Account.Card("4149 2310 9322 9221", 100)))
            , "Misha");

    public Account getVasyaAccount() {
        return vasyaAccount;
    }

    public Account getMishaAccount() {
        return mishaAccount;
    }
}
