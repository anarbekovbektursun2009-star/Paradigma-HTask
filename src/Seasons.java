import java.util.Scanner;

public class Seasons {
    Scanner scanner=new Scanner(System.in);
    public void Ye() {
        System.out.print("Пишите здесь чилсо -->");
        int a= scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("Время года : Зима " +"\n"+
                        "Месяц : Январь");
                break;
            case 2:
                System.out.println("Время года : Зима " +"\n"+
                        "Месяц : Февраль");
                break;
            case 3:
                System.out.println("Время года : Весна " +"\n"+
                        "Месяц : Март");
                break;
            case 4:
                System.out.println("Время года : Весна " +"\n"+
                        "Месяц : Апрель");
                break;
            case 5:
                System.out.println("Время года : Весна " +"\n"+
                        "Месяц : Май");
                break;
            case 6:
                System.out.println("Время года : Лето " +"\n"+
                        "Месяц : Июнь");
                break;
            case 7:
                System.out.println("Время года : Лето " +"\n"+
                        "Месяц : Июль");
                break;
            case 8:
                System.out.println("Время года : Лето " +"\n"+
                        "Месяц : Август");
                break;
            case 9:
                System.out.println("Время года : Осень " +"\n"+
                        "Месяц : Сентябрь");
                break;
            case 10:
                System.out.println("Время года : Осень " +"\n"+
                        "Месяц : Ноябрь");
                break;
            case 11:
                System.out.println("Время года : Осень " +"\n"+
                        "Месяц : Октябрь");
                break;
            case 12:
                System.out.println("Время года : Зима " +"\n"+
                        "Месяц : Декабрь");
                break;
            default:
                System.out.println("Такого месца нет!");
        }
    }

}
