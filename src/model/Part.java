package model;


public class Part {
    //Member variables
    private String description;
    private String code;
    private double price;



    //Constructor
    public Part(String description, String code, double price) {
        this.description = description;
        this.code = code;
        this.price = price;
    }

    //Getters
    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }


}