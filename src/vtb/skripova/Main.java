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
        }

    //таблица умножения
        {

        }
    //арифметическая или геометрическая прогрессию для N чисел
    }
}
