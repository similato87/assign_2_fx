package controller.part;

import model.Part;
import util.PartDao;

import java.util.Set;

public class PartService {

    //Initialize the goods
    public static void init() {
        PartDao.createDefaultList();
    }

    //Get all goods from the DAO layer
    public static Set<Part> getAllParts() {
        return PartDao.getPartSet();
    }

    //Print all attributes and parameters of all goods
    public static void printAllParts()  {

        //For-Each
        for (Part g : getAllParts()) {


            //Use loop to print the member variable name and calls the methods

            System.out.println("Description of Goods: " + g.getDescription());
            System.out.println("Code of Goods: " + g.getCode());
            System.out.println("Price of Goods: " + g.getPrice());


            //Add a gorgeous dividing line
            System.out.println("----------------------");

        }
    }

}
