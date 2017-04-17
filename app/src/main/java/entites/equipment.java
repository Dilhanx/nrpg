package entites;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by dilha on 17/4/2017.
 */

public class equipment extends item {
    String postition;
    String Status;
    int hp;
    int mp;
    int str;
    int dex;
    int intel;
    int ac;
    int damage;
    equipment(String name){
        try{
            BufferedReader br = new BufferedReader(new FileReader("app/res/item/equipment/"+name+".txt"));
            String[] details = br.readLine().split(",");
            name=details[0];
            postition=details[1];
            hp=Integer.parseInt(details[2]);
            mp= Integer.parseInt(details[3]);
            str=Integer.parseInt(details[4]);
            dex=Integer.parseInt(details[5]);
            intel=Integer.parseInt(details[6]);
            ac =Integer.parseInt(details[7]);
            damage=Integer.parseInt(details[8]);
            this.name=name;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
