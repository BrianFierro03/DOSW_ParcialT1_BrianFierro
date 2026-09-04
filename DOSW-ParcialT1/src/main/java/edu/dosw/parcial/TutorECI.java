package edu.dosw.parcial;
import java.util.ArrayList;
import java.util.Scanner;

public class TutorECI{
    private ArrayList<Tutor> tutors;
    private Choosing choosing;
    private ConexionEnlace conexionenlace;

    public void TutorECI(){
        this.tutors = new ArrayList<>();
        this.choosing = new Choosing();
        this.conexionenlace = new AdapterEnlace();
    }

    public void apartarTutor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su número de id:");
        int id = sc.nextInt();

        String data = this.conexionenlace.conectar(id);

        if (!data.equals("null")){
            System.out.println("Ingrese la materia");
            String materia = sc.nextLine().trim();
            
            String[] materias = data.split(",");
            boolean can = false;
            for (String s : materias){
                if(s.equals(materia)){
                    can = true;
                }

            }
            if (can){

            }
            else{
                System.out.println("Lo sentimos, no está viendo esta materia");
            }
        }
        else{
            System.out.println("Lo sentimos, este id no es válido.")
        }


        sc.close();
    }
}