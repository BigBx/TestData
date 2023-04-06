package 异常;
/*
*抓抛模型
*
*一、“抛”，在执行过程中，出现异常，在异常代码出生成异常类对象
*         并将对象抛出，之后代码不执行。
*二、"抓"，处理异常方式 1.try-catch-finally
*                    2.throws +异常类型
*try{
*       //可能异常代码
* }catch(异常类型1 变量1){
*       //处理方式1
* }catch(异常类型2 变量2){
*       //处理方式2
* }
* finally{
*   //一定执行的代码
* }
*
*说明：
* 1.finally:是可选的
* 2.使用try将可能的代码包装起来，在执行过程中，一旦出现异常，就会出现一个异常对象，根据其对象类型，去catch中匹配
* 3.一但try匹配到其中一个catch，就进入异常处理，跳出当前的try-catch结构（无finally情况下）。
* 4.catch的异常类型如果没有子父类关系，则谁声明在上、下都无关。
* 5.常用处理方式：1.String getMessage() 2.printStackTrace()
*/

import java.text.NumberFormat;

public class Demo01Exception {
    public static void main(String[] args) {
        ExceptionP();
    }
    public static void ExceptionP(){
        String str ="123";
        str="abc";
        try{
            int num=Integer.parseInt(str);
            System.out.println(2/0);
            System.out.println("hello----1");
        }catch (NumberFormatException e){
            e.printStackTrace();//将异常的信息输出在控制台
            System.out.println("错误");
        }catch (ArithmeticException e){
            String str3=e.toString();//抛出一些简短描述
            System.out.println("异常");
        }catch (Exception e){
            String str2=e.getMessage();//返回此throwable的详细消息字符串
        }
        System.out.println("hello-----2");
    }
}
