package org.example;



public class Kontroler {
    private Model model;
    private View view;

    public Kontroler(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public static void main(String[] args) {
        View.displayMenu();
        View.getUserChoice();



    }
}
