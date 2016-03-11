package org.innopolis.krikun.sa.task;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test cases based on software requirements
 */

public class TaskTest {

    Task task;

    @Before
    public void initTask() {
        task = new Task();
    }

    // As you say in chat.. Exception - the correct behavior
    // so what we will do - expect exceptions on wrong states

    /**
     * check for inability to set negative value
     */
    @Test (expected = Exception.class)
    public void validPsd() throws Exception { task.setPsd(-1); }

    @Test (expected = Exception.class)
    public void validPcd() throws Exception { task.setPcd(-1); }

    @Test (expected = Exception.class)
    public void validAsd() throws Exception { task.setAsd(-1); }

    @Test (expected = Exception.class)
    public void validAcd() throws Exception { task.setAcd(-1); }

    /**
     * this one not mention in specification, but by analogy with acd also been added
     * check that planned completion date can't be set without start date
     * like software requirements 2
     */
    @Test (expected = Exception.class)
    public void validPlannedCompletionDateSet() throws Exception {
        task.setPcd(0);
    }

    /**
     * check that planned completion date can't be set earlier than start date
     * software requirements 1
     */
    @Test (expected = Exception.class)
    public void validPlannedCompletionDate() throws Exception {
        task.setPsd(1);
        task.setPcd(0);
    }

    /**
     * check that actual completion date can't be set without start date
     */
    @Test (expected = Exception.class)
    public void validActualCompletionDateSet() throws Exception {
        task.setAcd(0);
    }

    /**
     * check that actual completion date can't be set earlier or equal to start date
     * software requirements 3
     */
    @Test (expected = Exception.class)
    public void validActualStartedDate() throws Exception {
        task.setAsd(0);
        task.setAcd(0);
    }

    /**
     * check that correct value's can be set to dates
     * use the boundary conditions
     */
    @Test
    public void checkForSetDate () throws Exception {
        task.setPsd(0);
        task.setPcd(0);
        task.setAsd(0);
        task.setAcd(1);
        assertEquals("Planning start date set properly", 0, task.getPsd());
        assertEquals("Planning completion date set properly", 0, task.getPcd());
        assertEquals("Actual start date set properly", 0, task.getAsd());
        assertEquals("Actual completion date set properly", 1, task.getAcd());
    }

}