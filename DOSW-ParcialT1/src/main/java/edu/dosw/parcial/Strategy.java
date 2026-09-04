package edu.dosw.parcial;
import java.util.ArrayList;

public interface Strategy {
    Tutor choose(ArrayList<Tutor> tutors);
}
