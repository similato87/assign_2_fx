package controller.buyer;

import model.Buyer;
import util.BuyerDao;

import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class BuyerService {

    public BuyerService() {

    }

    //Initialize the Buyers
    public static void init() {
        BuyerDao.init();
    }

    //Get all buyers from the DAO layer
    public static Set<Buyer> getAllBuyers() {
        return BuyerDao.getBuyerSet();
    }

    public static Map<String, Buyer> getAllBuyersWithName() {
        return BuyerDao.getBuyerMap();
    }

    //Print all attributes and parameters of all Buyers
    public void printAllBuyers() {

        //For-Each
        for (Buyer b : getAllBuyers()) {


            //Use loop to print the member variable name and calls the methods

            System.out.println("UserID: " + b.getUserId());
            System.out.println("UserStatus: " + b.getStatus());


            //Add a gorgeous dividing line
            System.out.println("----------------------");

        }
    }

    public void printAllBuyersWithName() {

        for (String name : getAllBuyersWithName().keySet()) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println(name + "'s UserID and status are " + getAllBuyersWithName().get(name).getUserId() + " and " + getAllBuyersWithName().get(name).getStatus() + ", respectively.");
        }

    }

    public static String checkUserStatus(int userId) {
        if (userId == 0) return "NONMEMBER";
        else if (userId < 100) return "INACTIVEMEMBER";
        else return "ACTIVEMEMBER";
    }


    public static void printBuyersCount() {
        System.out.println("BuyersCount: " + Buyer.getBuyersCount());
    }

    public static Buyer getBuyerbyUserID(int userId) {
        for (Buyer buyer : BuyerService.getAllBuyers()) {
            if (buyer.getUserId() == userId)
                return buyer;
        }
        return null;
    }

    public static boolean isMembership(int userId) {
        if (getBuyerbyUserID(userId) == null) {
            return false;
        } else return !"NONMEMBER".equals(Objects.requireNonNull(getBuyerbyUserID(userId)).getStatus());
    }

    public static int upgradeMembershipById(int userId) {
        if (userId == 0) {
            return assignId(Buyer.getLargestUserId());
        }
        return userId;
    }

    public void upgradeMembership(String  userName){
        getAllBuyersWithName().get(userName).setUserId(upgradeMembershipById(getAllBuyersWithName().get(userName).getUserId()));
        getAllBuyersWithName().get(userName).setStatus(checkUserStatus(getAllBuyersWithName().get(userName).getUserId()));
    }


    public static int assignId(int userId) {

        //Check if there is a user with this ID in the library
        if (getBuyerbyUserID(userId) != null) {
            userId = Buyer.getLargestUserId();
            Buyer.setLargestUserId(userId + 1);


            //If it is not less than the maximum, update the maximum
        } else if (userId >= Buyer.getLargestUserId()) {
            Buyer.setLargestUserId(userId + 1);

        }

        //If they all fit, do nothing


        return userId;
    }

    public static void addUserByUserId(int userId) {
        BuyerDao.addUserById(assignId(userId));
    }

    public void register(String userName, int userId) {
        BuyerDao.addUserByNameAndId(userName, assignId(userId));
    }

    public void register(String userName) {
        BuyerDao.addUserByName(userName);
    }


}
