package Strategie;

public class main {

    public static void main(String[]args){
        Canard [] tab=new Canard[3];
        tab[0]=new Colvert();
        tab[1]=new Mandarin();
        tab[2]=new CanardPlastic();
        for (Canard c:tab){
            c.afficher();
            c.concaner();
            c.nager();
            System.out.println();




        }
    }
}
