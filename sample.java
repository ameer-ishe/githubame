import java.util.Scanner;
class sample{
    public static void main(String []arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("name:");
        String name=sc.next();
        int ticket =100;
        int popcorn=50;
        int icecream=50;
        System.out.println("do you want ticket?");
        Boolean Ticket= sc.nextBoolean();
        System.out.println("do you want popcorn?");
        Boolean Popcorn= sc.nextBoolean();
        System.out.println("do you want icecream?");
        Boolean Icecream = sc.nextBoolean();
        int total = 0;
        if(Ticket==true){total=ticket + total;}
        if(Popcorn==true){total=popcorn + total;}
        if(Icecream==true){total=icecream + total;}
        int amount = sc.nextInt();
        System.out.println("amount:" +amount);
        int balance = amount - total;
        System.out.println("balance:" +balance);
    }
} 