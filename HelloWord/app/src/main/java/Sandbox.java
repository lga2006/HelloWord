import android.graphics.drawable.shapes.RectShape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lga on 2017/2/19.
 */

public class Sandbox extends RectShape {
    List<String> mGreetings=new ArrayList<String>();


//############################################################
//CONSTRUCTORS
//############################################################

    public Sandbox() {


    }

    public List<String> getGreetings() {
        return mGreetings;

    }
    public static final String HELLO="Hello sandbox";

    public void setGreetings(List<String> greetings) {
        mGreetings = greetings;
    }

    @Override
    public String toString() {
        return "Sandbox{" +
                "mGreetings=" + mGreetings +
                '}';
    }


}
