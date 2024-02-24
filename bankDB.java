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
public class bankDB {

    private client[] clients;
    private employee[] employees;

    public void setClient(client[] clients) {
        this.clients = clients;
    }

    public void setEmployee(employee[] employees) {
        this.employees = employees;
    }

    public client[] getClient() {
        return clients;
    }

    public employee[] getEmployee() {
        return employees;
    }

}
