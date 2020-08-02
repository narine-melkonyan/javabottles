import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int result = 8;
        Bottle B1 = new Bottle(6);
        Bottle B2 = new Bottle(10);

        System.out.println(B1.volume+","+B2.volume);

        if (B1.size==B2.size && B1.size==result){
            System.out.println("resolved");
        }else if(B1.size==B2.size && B1.size != result){
            System.out.println("can not resolve1");
        }else if(B2.size/B1.size==0 && B1.size!=result && B2.size!=result){
            System.out.println("can not resolve2");
        }

        for (int i = 0; i <100 ; i++) {

            B1.fill();
            System.out.println(B1.volume+","+B2.volume);
            B2.volume=B2.volume+B1.volume;
            B1.volume=B1.size-B1.volume;
            System.out.println(B1.volume+","+B2.volume);

            if (B2.volume>=B2.size) {
                B2.volume=B2.volume-B2.size;
                System.out.println(B1.volume+","+B2.volume);
            }
            if (B1.volume==result || B2.volume==result) {
                System.out.println("resolved");
                break;
            }
        }


    }
}
