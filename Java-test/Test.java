import java.util.Properties;
public class Test{
    public static void printProperties(){
        System.out.println("We are going to print the properties:");
        Properties properties = System.getProperties();
        System.out.println(properties);
    }

    public static void main(String [] args){
        System.out.println("Testing the docker image build with java project.");
        printProperties();
    }
}