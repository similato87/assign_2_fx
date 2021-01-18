/*
Results of the run:

userId:1000
status:ACTIVEMEMBER
----------------------
userId:10
status:INACTIVEMEMBER
----------------------
userId:0
status:NONMEMBER
----------------------

Process finished with exit code 0

*/

package controller.buyer;


import model.Buyer;

public class BuyerController {
    public static void main(String[] args)  {


        BuyerService sunShineBuyersClub = new BuyerService();
        sunShineBuyersClub.register("tom");
        sunShineBuyersClub.register("george",400);
        sunShineBuyersClub.register("sam",50);
        sunShineBuyersClub.register("ruth",150);
        sunShineBuyersClub.register("amid");
        sunShineBuyersClub.printAllBuyersWithName();

        System.out.println("***************\nAfter upgrading");

        sunShineBuyersClub.upgradeMembership("tom");
        sunShineBuyersClub.upgradeMembership("george");
        sunShineBuyersClub.upgradeMembership("sam");
        sunShineBuyersClub.upgradeMembership("ruth");
        sunShineBuyersClub.upgradeMembership("amid");
        sunShineBuyersClub.printAllBuyersWithName();


    }

}
