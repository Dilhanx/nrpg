package entites;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by dilha on 17/4/2017.
 */

public class passive_skill extends skill {
    int hp;
    int mp;
    int str;
    int dex;
    int intel;
    int ac;
    int damage;

    passive_skill(String name){
        try{
            BufferedReader br = new BufferedReader(new FileReader("app/res/skill/passive_skill/"+name+".txt"));
            String[] details = br.readLine().split(",");
            name=details[0];
            discription=details[1];
            value=Integer.parseInt(details[2]);
            level=Integer.parseInt(details[3]);
            hp=Integer.parseInt(details[4]);
            mp= Integer.parseInt(details[5]);
            str=Integer.parseInt(details[6]);
            dex=Integer.parseInt(details[7]);
            intel=Integer.parseInt(details[8]);
            ac =Integer.parseInt(details[9]);
            damage=Integer.parseInt(details[10]);
            this.name=name;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
