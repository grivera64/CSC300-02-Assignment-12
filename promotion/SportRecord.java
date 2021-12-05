//package assignment12.promotion;

/*
 *
 * Name: SportRecord.java
 * Purpose: Represents a record of customers with
 *          a sports team for filtering and printing purposes
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

public class SportRecord extends Record {

    private String team;

    public SportRecord(String name, String phoneNum, int index, String team) {

        super(name, phoneNum, index);
        this.setTeam(team);

    }

    public void setTeam(String team) {

        this.team = team;

    }

    public String getTeam() {

        return this.team;

    }

    public String toString() {

        return String.format("%s\n favorite team is the %s", super.toString(), this.getTeam());

    }

}
