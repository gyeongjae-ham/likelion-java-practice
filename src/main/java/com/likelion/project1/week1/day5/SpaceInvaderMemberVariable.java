package com.likelion.project1.week1.day5;

public class SpaceInvaderMemberVariable {
    int location; // 멤버변수

    public void moveLeft() {
        location = location - 1;
    }

    public void moveLeftAndPrint() {
        location = location - 1;
        System.out.println("moveLeft = " + location);
    }

    public void moveRight() {
        location = location + 1;
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
    }
}
