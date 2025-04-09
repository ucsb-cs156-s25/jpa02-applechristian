package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("test-team", team.getName());
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void toString_returns_correct_string_for_team_with_members() {
        Team t = new Team("Alpha");
        t.addMember("Alice");
        t.addMember("Bob");
        assertEquals("Team(name=Alpha, members=[Alice, Bob])", t.toString());
    }

    @Test
    public void equals_sameObject() {
        Team t = new Team("Alpha");
        t.addMember("Alice");
        t.addMember("Bob");
        assertEquals(true, t.equals(t));
    }

    @Test
    public void equals_differentClass() {
        Team t = new Team("Alpha");
        assertEquals(false, t.equals("not a team"));
    }

    @Test
    public void equals_sameName_sameMembers() {
        Team t1 = new Team("Alpha");
        t1.addMember("Alice");
        t1.addMember("Bob");

        Team t2 = new Team("Alpha");
        t2.addMember("Alice");
        t2.addMember("Bob");

        assertEquals(true, t1.equals(t2));
    }

    @Test
    public void equals_sameName_differentMembers() {
        Team t1 = new Team("Alpha");
        t1.addMember("Alice");
        t1.addMember("Bob");

        Team t2 = new Team("Alpha");
        t2.addMember("Charlie");

        assertEquals(false, t1.equals(t2));
    }

    @Test
    public void equals_differentName_sameMembers() {
        Team t1 = new Team("Alpha");
        t1.addMember("Alice");
        t1.addMember("Bob");

        Team t2 = new Team("Beta");
        t2.addMember("Alice");
        t2.addMember("Bob");

        assertEquals(false, t1.equals(t2));
    }

    @Test
    public void testHashCode() {
        Team t = new Team("TeamA");
        ArrayList<String> members = new ArrayList<>();
        members.add("Alice");
        members.add("Bob");
        t.setMembers(members);

        int result = t.hashCode();
        int expectedResult = 1976516598;

        assertEquals(expectedResult, result);
    }
}
