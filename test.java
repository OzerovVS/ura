import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        URLEncoder.encode(yourString, HTTP.UTF-8);
        Scanner i = new Scanner(System.in);
        while(true) {
            try {
                int vib = dey();
                Double first;
                Double second = 1.00;
                Double res;
                if (vib != 6) {
                    print("Введите первое число");
                    first = i.nextDouble();
                    print("Введите второе число");
                    second = i.nextDouble();
                    switch (vib) {
                        case 1:
                            res = first + second;
                            print(first + " + " + second + " = " + res);
                            break;
                        case 2:
                            res = first - second;
                            print(first + " - " + second + " = " + res);
                            break;
                        case 3:
                            res = first * second;
                            print(first + " * " + second + " = " + res);
                            break;
                        case 4:
                            while (true) {
                                if (second != 0) {
                                    res = first / second;
                                    print(first + " / " + second + " = " + res);
                                    break;
                                } else {
                                    print("Делить на 0 нельзя");
                                    print("Введите отличное от 0 значение 2 переменной");
                                    second = i.nextDouble();
                                }
                            }
                            break;
                        case 5:
                            res = Math.pow(first, second);
                            print(first + " ^ " + second + " = " + res);
                            break;

                    }
                } else {
                    print("Введите число, факториал которого хотите узнать");
                    first = i.nextDouble();
                    for (Double u = 1.00; u < first + 1; u++) {
                        second = second * u;
                    }
                    print(first + "! = " + second);
                }
            }
            catch(Exception a){
                print("Вам вывело ошибку: //" + a + "//" + "\nВведите нормально все пж, а то вам будет выводить эту же ошибку");
            }
        }

    }
    public static int dey() {
        while (true) {
            Scanner i = new Scanner(System.in);
            print("1.Cложение\n2.Вычитание\n3.Умножение\n4.Деление\n5.Возведение в степень\n6.Факториал числа\n7.Выйти из программы");
            int num = i.nextInt();
            if (num <7 && num >0) {
                return num;
            }
            else if(num == 7){
                System.exit(0);
            }
            else{
                print("Вы выбрали неправильное действие! Попробуйте снова");
            }
        }
    }
    public static void print(Object a) {
        System.out.println(a);
    }
}