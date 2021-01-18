/*
Results of the run:

description:GSM_digital_hand-held_radiotelephone_sets
code:1FBACF3FC
price:498.65
----------------------
description:Components_of_other_automatic_data_processing_equipment
code:1F8FB68C1
price:987.65
----------------------
description:Electronic_equipment_for_sound_processing_and_transmission
code:1FBBAB7CD
price:128.54
----------------------

Process finished with exit code 0

 */
package controller.part;


public class APOController {
    public static void main(String[] args) {

        //Initialize the goods service
        PartService.init();

        //print all the goods
        PartService.printAllParts();

    }
}
