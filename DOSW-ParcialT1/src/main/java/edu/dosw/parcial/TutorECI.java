package edu.dosw.parcial;
import java.util.ArrayList;
import java.util.Scanner;

public class TutorECI{
    private ArrayList<Tutor> tutors;
    private Choosing choosing;

    public void TutorECI(){
        this.tutors = new ArrayList<>();
        this.choosing = new Choosing();
    }

    public void apartarTutor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su número de id:");
        int id = sc.nextInt();

        boolean canContinue = false;

        
        sc.close();
    }
}