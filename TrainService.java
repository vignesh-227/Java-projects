package trainservice;
import java.util.Scanner;
public class TrainService {
    public static void main(String[] args) {
        
        // Declaration of arrays and Scanner object
        String[] deptme ={"Mon\t6:04", "Mon\t9:04", "Mon\t12:04", "Mon\t15:04", "Mon\t19:04", "Tue\t6:04", "Tue\t9:04", "Tue\t12:04", "Tue\t15:04", "Tue\t19:04", "Wed\t6:04", "Wed\t9:04", "Wed\t12:04", "Wed\t15:04", "Wed\t19:04"};
        int[] passnum = { 22,119,64,177,21,22,111,87,193,22,11,107,93,162,42};
        Scanner train = new Scanner(System.in);
        while (true){
        // Reading the choice from user
        System.out.println("Enter your choice");
        System.out.println("1. Display the info of all trains\n2. Find the most popular train\n3. Find the least popular train\n4. Compare the popularity of 6:04 train and 9:04 train\n5. Compare the popularity of 6:04 train on Monday and Tuesday\n6. Compare the popularity of any two trains of your choice\n7. Display the list of trains with below 50 passengers\n8. Calculate the average number of passengers on 12:04 train\n9.Display the number of passengers on any train of your choice\n10. Quit");
        int choice = train.nextInt();
        
        // Executing the program as per choice using if statement
        
        if (choice == 1){
        System.out.println("Day\tDeparture Time\tNumber of passengers");
        for (int i=0;i<deptme.length;i++)
            System.out.println(deptme[i]+"\t\t"+passnum[i]);
        }
        else if (choice == 2){
        int mpn = passnum[0];
        String mp = deptme[0];
        for (int i=0; i<deptme.length; i++){
            if (passnum[i]>mpn){
                mpn = passnum[i];
                mp = deptme[i];
            }
        }
        System.out.println("The most popular train is running at "+mp+" with "+mpn+" number of passengers");
        }
        else if (choice ==3){
        int lpn = passnum[0];
        String lp = deptme[0];
        for (int i=0; i<deptme.length; i++){
            if (passnum[i]<lpn){
                lpn = passnum[i];
                lp = deptme[i];
            }
        }
        System.out.println("The least popular train is running at "+lp+" with "+lpn+" number of passengers");
        }
        else if (choice ==4){
        if(passnum[0]>passnum[1])
            System.out.println("6:04 is more popular than 9:04 on Monday");
        else
            System.out.println("6:04 is less popular than 9:04 on Monday");
        if(passnum[5]>passnum[6])
            System.out.println("6:04 is more popular than 9:04 on Tuesday");
        else
            System.out.println("6:04 is less popular than 9:04 on Tuesday");
        if(passnum[10]>passnum[11])
            System.out.println("6:04 is more popular than 9:04 on Wednesday");
        else
            System.out.println("6:04 is less popular than 9:04 on Wednesday");
        }
        else if (choice ==5){
        if (passnum[0]>passnum[5])
            System.out.println("6:04 train is more popular on Monday than Tuesday");
        else if (passnum[0]<passnum[5]) 
            System.out.println("6:04 train is more popular on Tuesday than Monday");
        else
            System.out.println("6:04 train is equally popular on Monday an Tuesday");
        }
        else if (choice ==6){
        System.out.println("Enter the serial numbers of two trains to be compared");
        System.out.println("S. No.\tDay\tDeparture Time");
        for (int i=0;i<deptme.length;i++)
            System.out.println(i+"\t"+deptme[i]);
        int a=train.nextInt();
        int b=train.nextInt();
        if (passnum[a]>passnum[b])
            System.out.println(deptme[a]+" is more popular");
        else if (passnum[a]<passnum[b])
            System.out.println(deptme[b]+" is more popular");
        else
            System.out.println("Both trains are equally popular");
        }
        else if (choice ==7){
        System.out.println("The list of trains with below 50 passengers");
        System.out.println("Day\tDeparture Time\tNumber of passengers");
        for (int i=0; i<deptme.length; i++){
            if (passnum[i]<50){
                System.out.println(deptme[i]+"\t\t"+passnum[i]);
            }
                
        }
        }
        else if (choice ==8){
        System.out.println("The average number of passengers on 12:04 trains is "+((passnum[2]+passnum[7]+passnum[12])/3.0));
        }
        else if (choice ==9){
        System.out.println("Ënter the serial number of train for which the number of passengers info is needed");
        System.out.println("S. No.\tDay\tDeparture Time");
        for (int i=0;i<deptme.length;i++)
            System.out.println(i+"\t"+deptme[i]);
        int c = train.nextInt();
        System.out.println("The number of passengers travel on "+deptme[c]+" is "+passnum[c]);
        }
        else if (choice == 10)
            System.exit(0);
        else
            System.out.println("Invalid choice!");
        }
    }
    
}