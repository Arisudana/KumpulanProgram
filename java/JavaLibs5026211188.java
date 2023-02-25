import java.util.Scanner;

public class JavaLibs5026211188{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("This is a story where you became an outlaw in the wild west.");
        System.out.println();

        System.out.println("What is your name? ");
        System.out.print("(String) \t: ");
        String name1 = input.next();
        System.out.println();

        System.out.println("If you had a horse, what do you call it?");
        System.out.print("(String) \t: ");
        String horseName = input.next();
        System.out.println();

        System.out.println("What crime did you commited?");
        System.out.print("(String) \t: ");
        String crime = input.next();
        System.out.println();

	    System.out.println("How much bounty do you think you are worth? (in dollar)");
        System.out.print("(Integer) \t: ");
        int bountyPrice = input.nextInt();
        System.out.println();

        System.out.println("Enter a decimal number: ");
        System.out.print("(Double) \t: ");
        Double glassPrice = input.nextDouble();
        System.out.println();

        System.out.println("How many glass did you drink?");
        System.out.print("(Integer) \t: ");
        int glass = input.nextInt();
        System.out.println();
	    input.nextLine();

        double totalPrice = glassPrice * glass;

        int bountyPrice2 = bountyPrice*2;

        System.out.println("What is the best place to hide in the wild?");
        System.out.print("(String) \t: ");
        String place = input.nextLine();
        System.out.println();

        System.out.println("Enter a name for someone else :");
        System.out.print("(String) \t: ");
        String name2 = input.next();
        System.out.println();

        System.out.println("How many deputy are coming after you?");
        System.out.print("(Integer) \t: ");
        int deputy = input.nextInt();
        System.out.println();

        System.out.println("There was a gun fight, what do you think will happend to you? (Bad Ending)");
        System.out.print("(String) \t: ");
        String ending = input.nextLine();
        System.out.println();

        System.out.println();
        System.out.println("A long time ago in the Wild West, there was an outlaw called "+name1+" and a horse called "+horseName+". ");
        System.out.println("They are always together, exploring west America. "+name1+" was a wanted by the sheriff and being price at $"+bountyPrice+" for "+crime+". ");
        System.out.println(name1+" went into a bar and ordered some drink. The bartender gave "+name1+" a glass of whiskey which cost $"+glassPrice+".");
        System.out.println(name1+" drank "+glass+" glasses before suddenly a bounty hunter enter the bar. "+name1+" paid the bartender for $"+totalPrice+", then "+name1+" was confronted by the bounty hunter.");
        System.out.println("They fought and the bounty hunter got killed. The sheriff double the bounty, making it $"+bountyPrice2+" for the price of "+name1+" head.");
        System.out.println(name1+" was on the run, and found a place to hide, somewhere around "+place+".");
        System.out.println("After sometime, "+name1+" came out of hiding and went into town. A townfolk named "+name2+" recognize "+name1+" and alerted the sheriff.");
        System.out.println("The sheriff confronted "+name1+" with the help of "+deputy+" deputy.");
        System.out.println("There was a gun fight, "+name1+" was "+ending+". The sheriff gave the reward to "+name2+" for alerting the sheriff");
        System.out.println("The End.");
    }
}  