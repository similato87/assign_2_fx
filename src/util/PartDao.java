package util;

import model.Part;

import java.util.HashSet;
import java.util.Set;

public class PartDao {

    //Use a static collection of goods in the DAO layer to replace the data in the database
    private static Set<Part> partSet = new HashSet<>();

    //Return the goods set
    public static Set<Part> getPartSet() {
        return partSet;
    }

    //Add the initialized data as required by the problem
    public static void createDefaultList() {


        //Add the instantiated goods to the set.
        partSet.add(new Part("GSM_digital_hand-held_radiotelephone_sets", "1FBACF3FC", 498.65));
        partSet.add(new Part("Electronic_equipment_for_sound_processing_and_transmission", "1FBBAB7CD", 128.54));
        partSet.add(new Part("Components_of_other_automatic_data_processing_equipment", "1F8FB68C1", 987.65));

    }


}
