/* Java 資料型態、變數 - Java 入門課程教學
    https://youtu.be/XUeWcyhMNPc
 */

 // 單行註解
 /* 
 多行註解
  */

public class lesson1{
    public static void main(String[] args){
        // 在終端機印出各種資料型態的資料
        // 整數，預設是int型態
        int x = 3;
        System.out.println(x);
        // 長整數，數字的後面特別加上Ｌ
        long y = 20000000000L;
        System.out.println(y);

        // 浮點數，預設為double型態
        double m = 3.14159268;
        System.out.println(m);
        // 單精度浮點數，數字的後面特別加上Ｆ：到小數點後第七位
        float n = 3.14159268F;
        System.out.println((n));

        // 布林值
        boolean b;
        b = true;
        System.out.println(b);

        // 字元：單引號。
        char s = 'a';
        System.out.println(s);
        // 字串：雙引號。可包含０到多個字元
        String t = "哈囉你好";
        System.out.println(t);
        t= "你也好";
        System.out.println(t);
        
    }
}

