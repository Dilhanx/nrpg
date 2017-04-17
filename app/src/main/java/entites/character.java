package entites;


/**
 * Created by dilha on 17/4/2017.
 */

public class character extends creature {
    String gender;
    int exp;
    int level;
    int gold;
    int amour;
    int wepon;

    active_skill[] as;
    passive_skill[] ps;

    public void attack(monster m){
        int  ar = rand.nextInt(20) + 1+dex+tempdex;
        if(ar>m.ac+m.tempac){
            int dmg = rand.nextInt(damage) + 1+str+tempstr;
            m.hp-=dmg;
        }


    }
    public void deffend(){
        tempac+=dex+tempdex;
    }

    public void equip(){

    }
}
