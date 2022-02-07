package num2;

import java.util.Scanner;
/**
 *  Программа раскладывает числа на простые множители.
 *  Если число не целое - выводит сообщение об ошибке.
 */

public class Factoring
{

        public static void factorize(int n,int i)
        {
            if (i>n) return;
            if (i%i==0)
            {

                while(n%i==0)
                {
                    n=n/i;
                    System.out.println(i);
                }
            }
            factorize(n,i+1);
        }

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Введите число: " );
            int n;
            if(inp.hasNextInt()){
                n = inp.nextInt();
                System.out.println("Число " + n +" 3разложили: ");

                factorize(n,2);
            }else{
                System.out.print(" Число не целое");
            }
        }
    }

