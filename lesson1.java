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
        System.out.println(3);
        // 長整數，數字的後面特別加上Ｌ
        System.out.println(2000000000L);
        // 浮點數，預設為double型態
        System.out.println(3.14159268);
        // 單精度浮點數，數字的後面特別加上Ｆ：到小數點後第七位
        System.out.println((3.14159268F));
        // 布林值
        System.out.println(false);
        // 字元：單引號。
        System.out.println('a');
        // 字串：雙引號。可包含０到多個字元
        System.out.println("哈囉你好");
        
        //變數
        int x = 3;
        System.out.println(x); 
    }
}

