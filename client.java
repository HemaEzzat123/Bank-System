/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Hema
 */
public class client {

    private String name;
    private double ID;
    private account account;

    public client(String name, double ID, account account) {
        this.name = name;
        this.ID = ID;
        this.account = account;
    }

    private void userAccount() {
    }

    public double getBalance() {
        return account.getBalance();
    }

    public void setBalance() {

    }

    public void deleteAcc() {

    }
}
