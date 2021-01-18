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


public class BuyerController {
    public static void main(String[] args)  {


        BuyerService sunShineBuyersClub = new BuyerService();
        sunShineBuyersClub.register("tom");
        sunShineBuyersClub.register("george",400);
        sunShineBuyersClub.register("sam",50);
        sunShineBuyersClub.register("ruth",50);
        sunShineBuyersClub.register("amid");
        sunShineBuyersClub.printAllBuyersWithName();

    }

}
