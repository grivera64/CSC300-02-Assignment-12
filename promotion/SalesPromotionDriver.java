//package assignment12.promotion;

/*
 *
 * Name: SalesPromotionDriver.java
 * Purpose: Runs the Sales Promotion application
 *          based on test data
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class SalesPromotionDriver {

    private static final Customer[] customer = {
            new Customer("John Smith"   , "9084321212", "football",
                    "Giants", 3.61, null     , 0, null),
            new Customer("Indira Patel" , "7325551234", "tennis"  ,
                    null    , 3.92, "Java"   , 0, null),
            new Customer("Sarah Johnson", "2123231245", "football",
                    "Eagles", 3.71, null     , 1,
                    "Jane Hernadez,2017765765"),
            new Customer("Javier Jones" , "8568768765", "golf"    ,
                    null    , 3.85, "Physics", 1,
                    "Maria Regina,9086547654")
    };

    private static void matchCustomers(Customer cust, List<BiFunction<Customer, Integer, ? extends Record>> biFAL) {

        Record record;
        int ind;

        for (int j = 0; j < biFAL.size(); j++) {

            record = null;
            ind = 0;

            do {

                record = biFAL.get(j).apply(cust, ind);

                if (record != null) {

                    System.out.printf("%s\n\n", record);
                    ind = record.getIndex() + 1;

                }

            } while (record != null);

        }

        System.out.println();

    }

    public static void main(String[] args) {

        BiFunction<Customer, Integer, SportRecord> fSport = (x, z) -> {

            SportRecord sportRec = null;
            for (int i = z; i < customer.length && sportRec == null; i++) {

                if (customer[i].getSport().equals(x.getSport())) {

                    sportRec =
                            new SportRecord(customer[i].getName(), customer[i].getPhoneNum(), i, customer[i].getTeam());

                }

            }

            return sportRec;

        };

        BiFunction<Customer, Integer, GPARecord> fGPA = (x, z) -> {

            GPARecord gpaRec = null;

            for (int i = z; i < customer.length && gpaRec == null; i++) {

                if (customer[i].getGpa() >= x.getGpa()) {

                    gpaRec =
                            new GPARecord(customer[i].getName(), customer[i].getPhoneNum(), i, customer[i].getSubject());

                }

            }

            return gpaRec;

        };

        BiFunction<Customer, Integer, FriendsRecord> fFriends = (x, z) -> {

            FriendsRecord friendsRec = null;

            for (int i = z; i < customer.length && friendsRec == null; i++) {

                if (customer[i].getNumFriends() >= x.getNumFriends()) {

                    friendsRec =
                            new FriendsRecord(customer[i].getName(), customer[i].getPhoneNum(), i, customer[i].getFriends());

                }

            }

            return friendsRec;

        };

        List<BiFunction<Customer, Integer, ? extends Record>> list = new ArrayList<>();

        list.add(fSport);
        list.add(fGPA);
        list.add(fFriends);

        System.out.println("SUNDAY FOOTBALL PROMOTION - Call the following customers:");
        SalesPromotionDriver.matchCustomers(new Customer(null, null, "football", null,
                Double.MAX_VALUE, null, Integer.MAX_VALUE, null), list);

        System.out.println("TUESDAY HIGH-TECH PROMOTION - Call the following customers:");
        SalesPromotionDriver.matchCustomers(new Customer(null, null, null, null, 3.75,
                null, Integer.MAX_VALUE, null), list);

        System.out.println("FRIDAY BRING A FRIEND PROMOTION - Call the following customers:");
        SalesPromotionDriver.matchCustomers(new Customer(null, null, null, null,
                Double.MAX_VALUE, null, 1, null), list);

    }

}
