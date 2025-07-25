class std{
    String  name;
    public std(String name){
        this.name = name;
    }
}
public class exception {
    public static void main(String[] args){
        std myArr[] = new std[3];
        myArr [0] = new std("Java");
        myArr [1] = new std("Object");
        myArr [2] = new std("Array");
        for (std str: myArr){
            System.out.println(str.name);
        }
    }
}
