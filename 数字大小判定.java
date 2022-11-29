public class 零到一随机数 {
    public static void main(String[] args) {
        System.out.println(Math.random());

//这个是0-50的随机数字生成表达
        int r = (int) (Math.random()*100);
        System.out.println(r);

        if(r<50) {
            System.out.println("数比较小");
        }else{
            System.out.println("数比较大");
        }
    }
}
