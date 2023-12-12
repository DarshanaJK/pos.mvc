/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Order {
    private int id;
    private int CustId;
    private Date orderDate;
    private double total;

    public Order() {
    }

    public Order(int id, int CustId, Date orderDate, double total) {
        this.id = id;
        this.CustId = CustId;
        this.orderDate = orderDate;
        this.total = total;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the CustId
     */
    public int getCustId() {
        return CustId;
    }

    /**
     * @param CustId the CustId to set
     */
    public void setCustId(int CustId) {
        this.CustId = CustId;
    }

    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", CustId=" + CustId + ", orderDate=" + orderDate + ", total=" + total + '}';
    }
    
    
}
