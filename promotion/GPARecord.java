//package assignment12.promotion;

/*
 *
 * Name: GPARecord.java
 * Purpose: Represents a record of customers that
 *          go to school for filtering and printing purposes
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

public class GPARecord extends Record {

    private String subject;

    public GPARecord(String name, String phoneNum, int index, String subject) {

        super(name, phoneNum, index);
        this.setSubject(subject);

    }

    public void setSubject(String subject) {

        this.subject = subject;

    }

    public String getSubject() {

        return this.subject;

    }

    public String toString() {

        return String.format("%s\n favorite subject is the %s", super.toString(), this.getSubject());

    }

}
