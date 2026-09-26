package logicnotes.exercices;

public class CasoDoWhileContadorErrores {
    public static void main(String[] args) {

        int contador = 0;


        do{

            System.out.println("Se equivocó " +  ++contador);

        }while(contador < 3);
    }
}
