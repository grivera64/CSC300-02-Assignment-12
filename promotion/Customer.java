//package assignment12.promotion;

/*
 *
 * Name: Customer.java
 * Purpose: Represents a Customer in
 *          a promotion database
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

public class Customer {

    private String name;
    private String phoneNum;
    private String sport;
    private String team;
    private double gpa;
    private String subject;
    private int numFriends;
    private String friends;

    public Customer(String name, String phoneNum, String sport, String team,
                    double gpa, String subject, int numFriends, String friends) {

        this.setName(name);
        this.setPhoneNum(phoneNum);
        this.setSport(sport);
        this.setTeam(team);
        this.setGpa(gpa);
        this.setSubject(subject);
        this.setNumFriends(numFriends);
        this.setFriends(friends);

    }

    /* Name */
    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return this.name;

    }

    /* Phone */
    public void setPhoneNum(String phoneNum) {

        this.phoneNum = phoneNum;

    }

    public String getPhoneNum() {

        return this.phoneNum;

    }

    /* Sport */
    public void setSport(String sport) {

        this.sport = sport;

    }

    public String getSport() {

        return this.sport;

    }

    /* Team */
    public void setTeam(String team) {

        this.team = team;

    }

    public String getTeam() {

        return this.team;

    }

    /* GPA */
    public void setGpa(double gpa) {

        this.gpa = gpa;

    }

    public double getGpa() {

        return this.gpa;

    }

    /* Subject */
    public void setSubject(String subject) {

        this.subject = subject;

    }

    public String getSubject() {

        return this.subject;

    }

    /* Num Friends */
    public void setNumFriends(int numFriends) {

        this.numFriends = numFriends;

    }

    public int getNumFriends() {

        return this.numFriends;

    }

    /* Friends */
    public void setFriends(String friends) {

        this.friends = friends;

    }

    public String getFriends() {

        return this.friends;

    }

}
