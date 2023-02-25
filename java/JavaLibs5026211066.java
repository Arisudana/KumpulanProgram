import java.util.Scanner;

public class JavaLibs5026211066 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name1 = input.next();

        System.out.println("Enter another name: ");
        String name2 = input.next();

        System.out.println("Enter a number: ");
        int price1 = input.nextInt();

        System.out.println("If you could collect a lot of books, how much books would you have? ");
        int books = input.nextInt();

        System.out.println("How much money do you expect to earn on your first job? (in US Dollars)");
        int wage = input.nextInt();

        int totalmoney1 = price1*books;

        System.out.println("Name an object that you think is overpriced:");
        String object = input.next();

        System.out.println("Enter a large number:");
        double price2 = input.nextDouble();

        System.out.println("Enter a very small decimal number:");
        double sale = input.nextDouble();

        double totalmoney2 = price2-(price2*sale/100);

        System.out.println("What do you think about people who buy overpriced stuff regularly?");
        String negativeadj = input.next();

        System.out.println("What word would you use to describe your friendship with your closest friends?");
        String friendship = input.next();


        System.out.println();
        System.out.println("Two best friends, "+name1+" & "+name2+" lives together in a small apartment.");
        System.out.println(name1+ " works as a graphic designer and "+name2+" works in a typical office job.");
        System.out.println(name1+" likes to buy expensive art books. Most of those books cost around $"+price1+" and "+name1+" has "+books+" of them.");
        System.out.println(name2+" thinks it is stupid to spend around $"+totalmoney1+" just for books.");
        System.out.println("Especially when you only make around $"+wage+" a month.");
        System.out.println("Despite of that, "+name2+" also likes to spend a lot of money on "+object+".");
        System.out.println("One time, "+name2+" actually spent around $"+price2+" and got excited because there was a "+sale+"% sale for it.");
        System.out.println("Even "+name1+" thinks that spending $"+totalmoney2+" for that thing is "+negativeadj+".");
        System.out.println("Even though they like to overspend on certain things, they actually like to help other people. Both of them often donate to charity.");
        System.out.println("They always do this together because their "+friendship+" friendship has formed goodwill to contribute to society.");

    }
}