package Object_oriented1;
interface CallBack{
    //执行回调操作的方法
    void execute(); //统一的接口实现不同的内容
}
public class tools {
    public static void main(String [] args){
        tools tool = new tools();
        System.out.println("String");
        tool.testTime(new CallBack() {
            @Override
            public void execute() {//测试String性能
                String str = new String();
                for(int i = 0; i < 10000; i++)
                    str = str + i;
            }
        });
        System.out.println("StringBuffer ");
        tool.testTime(new CallBack() {
            @Override
            public void execute() {//测试StringBuffer性能
                StringBuffer sbf = new StringBuffer();
                for(int i = 0; i < 100000; i++)
                    sbf.append(i);
            }
        });
        System.out.println("StringBuffer ");


    }
    public void testTime(CallBack callback){
        long begin = System.currentTimeMillis();//测试起始时间
        callback.execute();
        long end = System.currentTimeMillis();//测试结束时间
        System.out.println("[use time] ： " + (end - begin));
    }
}
