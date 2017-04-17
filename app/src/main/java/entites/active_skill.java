package entites;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created by dilhan.
 */

public class active_skill extends skill {
    String type;
    int damage;
    int no_of_attacks;
    Random rand = new Random();

    public void attack(monster m){
        for(int a=0; a <no_of_attacks+level;a++){
            int  ar = rand.nextInt(20) + 1;
            if(ar>m.ac+m.tempac){
                int dmg = rand.nextInt(damage) + 1;
                m.hp-=dmg;
            }
        }

    }
    public void heal(character c){
        for(int a=0; a <no_of_attacks+level;a++){
                int heal= rand.nextInt(damage) + 1;
                c.hp+=heal;

        }

    }
    active_skill(String name) {


        try {
            BufferedReader br = new BufferedReader(new FileReader("app/res/skill/active_skill/"+name+".txt"));
            String[] details = br.readLine().split(",");
            name=details[0];
            discription=details[1];
            value=Integer.parseInt(details[2]);
            level=Integer.parseInt(details[3]);
            type=details[4];
            damage=Integer.parseInt(details[5]);
            no_of_attacks=Integer.parseInt(details[6]);
            this.name = name;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
