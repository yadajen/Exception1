/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Student
 */
public class LAB6 {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            StackTraceElement[] st = e.getStackTrace();
            for (int i = 0; i < st.length; i++) {

                System.out.println(st[i].getClassName());
                System.out.println(st[i].getMethodName());
                System.out.println(st[i].getFileName());
                System.out.println(st[i].getLineNumber());

            }
        }
    }

}
