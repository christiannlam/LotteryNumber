import java.util.*;
public class Lab5
{
    public static Set<Integer> generateWinningTicket()
    {
        Set<Integer> winNums = new TreeSet<Integer>();
        Random rand = new Random();
        int numCounter = 0;
        while (numCounter < 6)
        {
            winNums.add(rand.nextInt(40) +1 );
            numCounter++;
        }
        return winNums;
    }
    public static Set<Integer> getTicket()
    {
        Scanner input = new Scanner (System.in);
        Set<Integer> userNum = new TreeSet<Integer>();
        System.out.println("Enter Your Lotto Number: ");
        String numbers = input.nextLine();
        String[] numString = numbers.split(" ");
        for(int i = 0; i < numString.length; i++)
        {
            userNum.add(Integer.parseInt(numString[i]));
        }
        return userNum;
    }
    public static void main ( String args[])
    {
        Set<Integer> ticketNums = generateWinningTicket();
        Set<Integer> userNum = getTicket();
        System.out.print("Your Ticket was: " + userNum);
        System.out.print("\nWinning Numbers: " + ticketNums);
        userNum.retainAll(ticketNums);
        System.out.print("\nMatching Numbers: " + userNum);
        System.out.println("\nYour Prize is: $" + userNum.size() * 200);

    }
}
