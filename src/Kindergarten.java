import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.List;

public class Kindergarten {



    public List<Object> kinderNames;
    public String kinderGartenName;
    public String address;
    public int kinderMaxNumber;











    public Kindergarten(int kinderMaxNumber) {
        this.kinderMaxNumber = kinderMaxNumber;
        this.kinderNames = new ArrayList<Object>();


    }




    public void newChild(String name,int age) {
        Kinder one = new Kinder(name, age);
        kinderNames.add((Object) one);
    }

    
}

