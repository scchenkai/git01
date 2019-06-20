package cn.chankai.singleton;

public class Round1 {

    private volatile static Round1 round1;

    public static Round1 getInstance(){
        //进行第一次校验,是否为null,第一次校验是为了判断当前是否存在,提高效率
        if (round1 == null){
            synchronized (Round1.class){//现在加锁,防止多线程出现问题
                //进行第二次校验,进行第二次校验是为了当都完成了第一个校验的时候,不校验就会问题,单只有第一个校验,线程并发会出现多实例,
                // 单只有第二次校验效率太低;
                if (round1 == null){
                    round1 = new Round1();
                }
            }
        }
        return round1;
    }
}
