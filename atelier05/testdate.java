package atelier05;

public class testdate {

    public static void main(String[] args) {
        date today = new date(); 
        date targetDate = new date(14, 12, 2024); 

        int joursRestants = today.nbJours(targetDate);

        System.out.println("Nombre de jours restants avant le 14 12 2024 : " + joursRestants);
    }
}
