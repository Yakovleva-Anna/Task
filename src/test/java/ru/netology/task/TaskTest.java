package ru.netology.task;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class TaskTest {
    @Test
    public void testMatchesSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Title1");

        boolean actual = simpleTask.matches("le1");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Title1");

        boolean actual = simpleTask.matches("le2");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesEpicTrue() {
        String[] subtasks = {"Subtask1", "Subtask2", "Subtask3"};
        Epic epic = new Epic(10, subtasks);

        boolean actual = epic.matches("task2");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesEpicFalse() {
        String[] subtasks = {"Subtask1", "Subtask2", "Subtask3"};
        Epic epic = new Epic(10, subtasks);

        boolean actual = epic.matches("Task2");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingTrueTopic() {
        Meeting meeting = new Meeting(7, "Topic1", "Project2", "00:00, 03.03.2023");

        boolean actual = meeting.matches("pic1");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingFalseTopic() {
        Meeting meeting = new Meeting(7, "Topic1", "Project2", "00:00, 03.03.2023");

        boolean actual = meeting.matches("pic5");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingTrueProject() {
        Meeting meeting = new Meeting(7, "Topic1", "Project2", "00:00, 03.03.2023");

        boolean actual = meeting.matches("ect");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingFalseProject() {
        Meeting meeting = new Meeting(7, "Topic1", "Project2", "00:00, 03.03.2023");

        boolean actual = meeting.matches("pro");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingStart() {
        Meeting meeting = new Meeting(7, "Topic1", "Project2", "00:00, 03.03.2023");

        boolean actual = meeting.matches("03");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
