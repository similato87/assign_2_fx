package util;

import model.Buyer;


import java.util.*;

public class BuyerDao {

    //Use a static collection of buyers in the DAO layer to replace the data in the database
    private static Set<Buyer> buyerSet = new HashSet<>();
    private static Map<String, Buyer> buyerMap = new LinkedHashMap<>();


    //Return the buyer set
    public static Set<Buyer> getBuyerSet() {
        return buyerSet;
    }

    public static Map<String, Buyer> getBuyerMap() {
        return buyerMap;
    }

    //Add the initialized data as required by the problem
    public static void init() {

        //Add the instantiated buyers to the set.
        buyerSet.add(new Buyer());
        buyerSet.add(new Buyer(10));
        buyerSet.add(new Buyer(1000));


    }

    public static void addUserById(int userId) {
        buyerSet.add(new Buyer(userId));
    }

    public static void addUserByNameAndId(String userName, int userId){
        buyerMap.put(userName,new Buyer(userId));
    }
    public static void addUserByName(String userName){
        buyerMap.put(userName,new Buyer());
    }
}
