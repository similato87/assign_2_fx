package model;

import controller.buyer.BuyerService;

public class Buyer {
    private int userId;
    private String status;
    private static int BuyersCount = 0;
    private static int largestUserId = 100;

    //constructor without arguments
    public Buyer() {
        this.userId = 0;
        this.status = "NONMEMBER";
        BuyersCount++;
    }

    //constructor with a required argument
    public Buyer(int userId) {

        this.userId = userId;
        this.status = checkStatus();


        BuyersCount++;
    }

    //Getters
    public int getUserId() {
        return userId;
    }

    public String getStatus() {
        return status;
    }

    public static int getLargestUserId() {
        return largestUserId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void setLargestUserId(int largestUserId) {
        Buyer.largestUserId = largestUserId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    //Invoke the inspection service in the service layer
    private String checkStatus() {
        return BuyerService.checkUserStatus(this.userId);


    }

    public static int getBuyersCount() {
        return BuyersCount;
    }

    public void upgradeMembership() {

        BuyerService.upgradeMembershipById(this.userId);
    }

}
