package cn.jxau.zhaowei.myspringboot.hello;

/**
 * @ClassName Greeting
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/27 16:45
 * @Version 1.0
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId(){ return this.id;}

    public String getContent(){ return this.content;}
}
