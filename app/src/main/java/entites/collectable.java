package entites;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by dilhan.
 */

public class collectable extends item {
    int quantity;
    public boolean checkQuantity(int q){
        if(q==quantity)
            return true;
        else
            return false;
    }
    collectable(String name){
        try{
            BufferedReader br = new BufferedReader(new FileReader("app/res/item/collectable/"+name+".txt"));
            String[] details = br.readLine().split(",,");
            name=details[0];
            discription=details[1];
            value=Integer.parseInt(details[2]);
            tier=Integer.parseInt(details[3]);
            quantity=0;
            this.name=name;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
