package pers.myc.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */
public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Heart");
        list.add("Spade");
        list.add("Diamond");
        list.add("Club");

        for(int i = 0; i<list.size(); i++){       //方法一
            System.out.println(list.get(i));
        }

        Iterator listIt = list.iterator();
        while(listIt.hasNext()){
            String list2 = (String) listIt.next();//方法二
            System.out.println(list2);
        }
    }
}
