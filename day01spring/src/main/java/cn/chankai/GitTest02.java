package cn.chankai;


/**
 *
 *  有冲突吗
 *  没有加入管理(红色)-- add--> 暂存区(绿色) --> 修改未提交 -->蓝色 -->修改提交--commit-->白色
 *
 */
public class GitTest02 {

    public static void main(String[] args) {
        System.out.println("暂未加入git管理,就是红色");

        System.out.println("加入git管理,暂未提交");

        System.out.println("我是master分支");
    }
}
