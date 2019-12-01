public class demo01Phone{
    public static void main(String[] args){
        phone one=new phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.brand="苹果";
        one.price="6888.2";
        one.color="黑色";
        one.call(who:"a");
    }
}