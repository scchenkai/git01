package cn.chankai;


/**
 *
 *  有冲突吗
 *  没有加入管理(红色)-- add--> 暂存区(绿色) --> 修改未提交 -->蓝色 -->修改提交--commit-->颜色正常
 *
 */
public class GitTest02 {

    public static void main(String[] args) {
        System.out.println("暂未加入git管理,就是红色");

        System.out.println("加入git管理,暂未提交");

        test();

        System.out.println("git提示");

        System.out.println("我是master分支");

        System.out.println("11111");

        System.out.println("08");

        System.out.println("09");
    }

    public static void  test(){
        System.out.println(3 + 2);

    }
}
