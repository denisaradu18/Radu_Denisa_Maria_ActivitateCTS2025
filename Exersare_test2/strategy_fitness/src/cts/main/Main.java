package cts.main;

import cts.clase.*;

public class Main {
    public static void main(String[] args) {
        ITipExercitiu flotari = new Flotari();
        ITipExercitiu genuflexiuni = new Genuflexiuni();
        ITipExercitiu abdomene = new Abdomene();

        IChallenge challenge1 = new Challenge( flotari,"Ana");
        IChallenge challenge2 = new Challenge( abdomene,"Ion");

        challenge1.startChallenge();

        challenge2.setTipExercitiu(genuflexiuni);
        challenge2.startChallenge();
    }
}
