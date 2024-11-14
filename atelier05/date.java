package atelier05;

import util.Keyboard;

public class date {
    private int jour, mois, annee;

    // 构造函数
    public date(int j, int m, int a) {  
        jour = j; 
        mois = m; 
        annee = a;
    }

    public date() {
        Lire();
    }

    // 计算当前日期和目标日期之间的天数差
    public int nbJours(date cible) {
        date temp = new date(jour, mois, annee);
        int joursRestants = 0;
        
        while (temp.estAvant(cible)) {
            temp.Incrementer();
            joursRestants++;
        }
        
        return joursRestants;
    }

    public boolean estAvant(date d) {
        if (annee < d.annee) return true;
        if (annee == d.annee && mois < d.mois) return true;
        if (annee == d.annee && mois == d.mois && jour < d.jour) return true;
        return false;
    }

    // 增加一天
    public void Incrementer() {
        int[] lmois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            lmois[1] = 29;
        }
        
        jour++;
        if (jour > lmois[mois - 1]) {
            jour = 1;
            mois++;
            if (mois > 12) {
                mois = 1;
                annee++;
            }
        }
    }

    public void Afficher() {
        System.out.println(jour + " " + mois + " " + annee);
    }

    private void Lire() {
        jour = Keyboard.getInt("Entrez le jour");
        mois = Keyboard.getInt("Entrez le mois");
        annee = Keyboard.getInt("Entrez l'année");
    }
}
