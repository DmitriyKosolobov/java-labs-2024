package org.example;

public class InvoiceExample {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem(new Invoice.Item("Вода", 2000, 20));
        invoice.addItem(new Invoice.Item("Ананас", 100, 300));
        invoice.addItem(new Invoice.Item("Яйца", 200, 150));
        invoice.addItem(new Invoice.Item("Творог", 50, 80));
        invoice.printInvoice();
    }
}
