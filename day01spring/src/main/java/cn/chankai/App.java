package cn.chankai;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String sql = "小明";
        System.out.println( "Hello World!" );

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(9);
        list2.add(1);
        ArrayList<Object> all = new ArrayList<>();

        for (Object o : list) {
            if (list2.contains(o)){
                all.add(o);
            }
        }
        for (Object o : all) {
            System.out.println(o);

        }

    }
}
