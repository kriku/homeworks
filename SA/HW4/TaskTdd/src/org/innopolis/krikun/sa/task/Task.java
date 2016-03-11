package org.innopolis.krikun.sa.task;

/**
 * Encodes a task that is used in the planning of project activities.
 */

public class Task {
    private int psd, pcd;
    private int asd, acd;

    /**
     * constructor of task instance
     * date value = -1 - not set date
     */
    public Task() {
        psd = pcd = asd = acd = -1;
    }

    /**
     * method for checking correctness value to set, 
     * or checking that date haven't been set (value = -1)
     * throws exception if value invalid, or haven't been set
     */
    private void checkDateSet(int date, String message) throws Exception {
        if (date < 0) throw new Exception(message);
    }

    /**
     * method for checking correctness of date values
     * firstDate must be less or equal secondDate, or secondDate not set
     * otherwise throws exception (check software requirement 1)
     */
    private void checkSecondDateBiggerOrEqual(int firstDate, int secondDate, String message) throws Exception {
        if (firstDate > secondDate && secondDate >= 0) throw new Exception(message);
    }

    /**
     * method for checking correctness of date values
     * firstDate must be less secondDate, or secondDate not set
     * otherwise throws exception (check software requirement 3)
     */
    private void checkSecondDateBigger(int firstDate, int secondDate, String message) throws Exception {
        if (firstDate >= secondDate && secondDate >= 0) throw new Exception(message);
    }

    public int getPsd() {
        return psd;
    }

    public void setPsd(int psd) throws Exception {
        checkDateSet(psd, "Date can't be negative");
        checkSecondDateBiggerOrEqual(psd, pcd, "Planned start date can't be bigger than completion date");
        this.psd = psd;
    }

    public int getPcd() {
        return pcd;
    }

    public void setPcd(int pcd) throws Exception {
        checkDateSet(pcd, "Date can't be negative");
        checkDateSet(psd, "Planned completion date can't be set without start date");
        checkSecondDateBiggerOrEqual(psd, pcd, "Planned start date can't be bigger than completion date");
        this.pcd = pcd;
    }

    public int getAsd() {
        return asd;
    }

    public void setAsd(int asd) throws Exception {
        checkDateSet(asd, "Date can't be negative");
        checkSecondDateBigger(asd, acd, "Actual start date can't be bigger or equal to completion date");
        this.asd = asd;
    }

    public int getAcd() {
        return acd;
    }

    public void setAcd(int acd) throws Exception {
        checkDateSet(acd, "Date can't be negative");
        checkDateSet(asd, "Planned completion date can't be set without start date");
        checkSecondDateBigger(asd, acd, "Actual start date can't be bigger or equal to completion date");
        this.acd = acd;
    }
}
