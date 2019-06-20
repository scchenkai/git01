package cn.chankai;

import static org.junit.Assert.assertTrue;

import cn.chankai.singleton.Round1;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * 使用反射破坏单例
     */
    @Test
    public void destorySingleTon() {
        //获取单例类\
        try {
            Class<?> clz = Class.forName(Round1.class.getName());
            //获取构造方法
            Constructor<?>[] constructors = clz.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                constructors[i].setAccessible(true);
                try {
                    Round1 instance = Round1.getInstance();
                    Round1 one =  (Round1)constructors[i].newInstance();
                    System.out.println(one == instance);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //
    }
}
