package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Christian L.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "applechristian";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-16");
        team.addMember("Jeffrey L.");
        team.addMember("John H.");
        team.addMember("Derek K.");
        team.addMember("Suhrit P.");
        team.addMember("Wilson L.");
        team.addMember("Christian L.");
        return team;
    }
}
