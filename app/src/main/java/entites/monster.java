package entites;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by dilhan
 */

public class monster extends creature {
    int loot_gold;
    int cr;
    String type;

    int no_of_attacks;

    public void deffend(){
        tempac+=dex+tempdex;
    }
    public void attack(character c){
        for(int a=0; a <no_of_attacks;a++){
            int  ar = rand.nextInt(20) + 1+dex+tempdex;
            if(ar>c.ac+c.tempac){
                int dmg = rand.nextInt(damage) + 1+str+tempstr;
                c.hp-=dmg;
            }
        }

    }
    monster(String name){

        try{
            BufferedReader br = new BufferedReader(new FileReader("app/res/monster/"+name+".txt"));
            String[] details = br.readLine().split(",");
            creatureID=Integer.parseInt(details[0]);
            hp= maxhp =Integer.parseInt(details[1]);
            mp= maxmp= Integer.parseInt(details[2]);
            str=Integer.parseInt(details[3]);
            dex=Integer.parseInt(details[4]);
            intel=Integer.parseInt(details[5]);
            ac =Integer.parseInt(details[6]);
            this.name=name;
        }
       catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
