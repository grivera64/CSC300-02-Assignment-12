//package assignment12.promotion;

/*
 *
 * Name: Record.java
 * Purpose: Represents an abstract record for storage and
 *          printing purposes
 * Author: grivera64
 * Date: 12/6/2021
 *
 */

public abstract class Record {

    private String name;
    private String phoneNum;
    private int index;

    public Record(String name, String phoneNum, int index) {

        this.setName(name);
        this.setPhoneNum(phoneNum);
        this.setIndex(index);

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return this.name;

    }

    public void setPhoneNum(String phoneNum) {

        this.phoneNum = phoneNum;

    }

    public String getPhoneNum() {

        return this.phoneNum;

    }

    public void setIndex(int index) {

        this.index = index;

    }

    public int getIndex() {

        return this.index;

    }

    public String toString() {

        return String.format("name: %s phone number: %s", this.getName(), this.getPhoneNum());

    }

}
