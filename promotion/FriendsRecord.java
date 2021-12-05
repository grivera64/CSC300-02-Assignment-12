//package assignment12.promotion;

/*
 *
 * Name: FriendsRecord.java
 * Purpose: Represents a record of customers with
 *          friends for filtering and printing purposes
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

public class FriendsRecord extends Record {

    private String friends;

    public FriendsRecord(String name, String phoneNum, int index, String friends) {

        super(name, phoneNum, index);
        this.setFriends(friends);

    }

    public void setFriends(String friends) {

        this.friends = friends;

    }

    public String getFriends() {

        return this.friends;

    }

    public String toString() {

        return String.format("%s\n friends are %s", super.toString(), this.getFriends());

    }

}
