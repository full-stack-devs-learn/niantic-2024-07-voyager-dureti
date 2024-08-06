package com.niantic.part_1_sakila_dtos;

public class Actor {
    private int ActorId;
    private String FirstName;
    private String LastName;

    public Actor() {
    }

    public Actor(int actorId, String firstName, String lastName) {
        ActorId = actorId;
        FirstName = firstName;
        LastName = lastName;
    }

    public int getActorId() {
        return ActorId;
    }

    public void setActorId(int actorId) {
        ActorId = actorId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFullName(){
        return STR."\{FirstName} \{LastName}";
    }

}