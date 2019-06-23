package cn.chankai;

import cn.chankai.singleton.Round1;

import java.util.ArrayList;

public class MyTesst {

    public static void main(String[] args) {
        Round1 round1 = Round1.getInstance();
        Round1 instance = Round1.getInstance();

        Integer i = 10;

        //测试集合能不能装基础数据类型
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);     //这里能放进去是因为自动装箱
        for (Object object : objects) {
            System.out.println(object.getClass());

        }

    }


}
