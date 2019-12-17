package design.pattern.singleton.example1;

public class President {
    private static volatile President president = null;

    private President(){
        System.out.println("President tasks office!");
    }

    public static synchronized President getPresident(){
        if(president == null){
            System.out.println("Elected a new president!");
            president = new President();
        } else {
            System.out.println("President is already exist!");
        }
        return president;
    }

    public void getPresidentName(){
        System.out.println("President's name is YiHa!");
    }

    public static void main(String[] args) {
        President president_1 = President.getPresident();
        president_1.getPresidentName();
        President president_2 = President.getPresident();
        president_2.getPresidentName();
        if(president_1==president_2){
            System.out.println("Both of them are same!");
        } else {
            System.out.println("The two of them are different!");
        }
    }
}
