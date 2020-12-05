package vtb.skripova;

public class Main {

    public static void main(String[] args) {
	//поиск минимального из двух чисел
        {
            int a = 152, b = 153, x;
            if (a > b) x=b; else x=a;
            System.out.println("поиск минимального из двух чисел");
            System.out.println(x);
            System.out.println(" ");
        }

    //описание введенного числа
        {
            int a=2442;
            String b;
            String [] S= {"четное ","нечетное ","отрицательное ","положительное ","нулевое"};
            if (a==0) b=S[4]; else
                if (a>0)
                    if (a%2==0) b=S[0]+S[3]; else b=S[1]+S[3];
                else
                    if (a%2==0) b=S[0]+S[2]; else b=S[1]+S[2];
            System.out.println("описание введенного числа");
            System.out.println(b);
            System.out.println(" ");
        }

    //таблица умножения
        {
            System.out.println("таблица умножения");
            for (int x, i = 2; i <= 9; i++)
                {for (int j = 1; j <= 10; j++)
                    {x=i*j;
                    System.out.println(i+"*"+j+"="+x);
                   }
                System.out.println(" ");
                }
            System.out.println(" ");
        }

    //арифметическая или геометрическая прогрессию для N чисел
        {
            System.out.println("арифметическая прогрессия");

            int a, d, n, i, x;
            a = 1; // первое число
            d = 10; // шаг прогрессии
            i = 1; //порядковый номер числа
            n = 5; //количество чисел в прогрессии
            while (i <= n) {
                x = a + (i - 1) * d;
                i += 1;
                System.out.println(x);
            }
            System.out.println(" ");
        }

        System.out.println("геометрическая прогрессия");
        {
            int d, n, i, x;
            x = 3; // первое число
            d = -2; // знаменатель прогрессии
            i = 1; //порядковый номер числа
            n = 5; //количество чисел в прогрессии
            System.out.println(x);
            while (i <= (n-1)) //n-1 потому что первое число уже выведено в строке выше
            {
                x = x * d;
                i += 1;
                System.out.println(x);
            }
        }
    }
}
