import java.util.*;

public class Main {
    public static void main(String[] args) {
/**
 //        Map<Integer,Integer>integerMap=new LinkedHashMap<>();
 //        integerMap.put(1,24);
 //        integerMap.put(2,67);
 //        integerMap.put(3,6);
 //        System.out.println(integerMap.entrySet());
 //        System.out.println(integerMap.get(2));
 //        integerMap.replace(2,344);
 //
 //        for(Map.Entry<Integer,Integer> m:integerMap.entrySet()){
 //            System.out.println(m.getKey()+" : "+m.getValue() );
 //
 //        }**/


/**zadacha**/
//        User user = new User("Malika", "Moloshova");
//        Map<User, BankAccount> map = new HashMap<>();
//        transaction(map, user, 5000);
//        System.out.println(map);
//
//        BankAccount bankAccount=new BankAccount(2000);
//        bankAccount.addBalance(200);
//        bankAccount.takeMoney(300);
//        System.out.println(bankAccount);
//
//
//    }
//
//    public static void transaction(Map<User, BankAccount> map, User user, int money) {
//        map.put(user, new BankAccount(money));\


        Map<Integer,Integer>map=new HashMap<>();
        int []san=new int[10];
        Random random=new Random();
        for (int i = 0; i <san.length ; i++) {
            san[i] = random.nextInt(10, 20);
        }
            for(int i:san){
                if(!map.containsKey(i)){
                    map.put(i,0);
                }else{
                    int dublicate=map.get(i)+1;
                    map.put(i,dublicate);
                }
        }
        System.out.println(Arrays.toString(Arrays.stream(san).toArray()));
        System.out.println(map);

        }


    }
