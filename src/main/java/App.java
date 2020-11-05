import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Podaj nr zadania w przykładowym formacie: '0201' ");
        System.out.println("Dostępne zadania:");
        System.out.println("02 : 9 zadań   |  03 : 5 zadań   |   04 : 12 zadań   |   05 : 3 zadania");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        invokeMethod(data);
    }

    private static void invokeMethod(String className) throws Exception {

        String zadanie = new StringBuilder().append("Zajecia ")
                .append(className.substring(0, 2))
                .append(": Zadanie ")
                .append(className.substring(2, 4))
                .toString();

        String result = new StringBuilder().append("Zajecia")
                .append(".")
                .append("Zajecia")
                .append(className.substring(0, 2))
                .append(".")
                .append("Zad")
                .append(className)
                .toString();

        System.out.println();
        System.out.println(zadanie);

        Class<?> zad = Class.forName(result);
        Constructor<?> cons = zad.getDeclaredConstructor();
        Object obj = cons.newInstance(null);
        Method m = zad.getDeclaredMethod("rozwiazanie");
        m.invoke(obj);
    }
}

