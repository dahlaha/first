import java.util.Scanner;
public class Main {
    /**
     * Метод проверющий является ли строка палиндромом
     * @param palindrome строка для проверки
     * @return если строка является палиндромом {@code true}, иначе {@code false}
     */
    public static boolean palindrome_check(String palindrome){
        for(int i=0;i<palindrome.length()/2;i++){//проверяет равенство крайних символов строки вглубь
            if(palindrome.charAt(i)!=palindrome.charAt(palindrome.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Введите строку для проверки: ");
        String palindrome= in.nextLine();//на вход подается строка без знаков препинания
        /*в метод передается строка без пробелов в нижнем регистре,
        исходя из результата проверки палиндрома, выводится соответствующий результат*/
        if(palindrome_check(palindrome.replace(" ","").toLowerCase())){
            System.out.printf("Строка: %s \nЯвляется палиндромом",palindrome);
        }
        else {
            System.out.printf("Строка: %s \nНЕ является палиндромом",palindrome);
        }
    }
}