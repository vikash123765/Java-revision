import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        String url ="www.faceboook.com";

        InetAddress inetAddress = InetAddress.getByName(url);

        System.out.println("adress :" + Arrays.toString(inetAddress.getAddress()));

        // getHostadress
        System.out.println("host adress is: " + inetAddress.getHostAddress());

        // islocaladress
        System.out.println("islocal adreess :" + inetAddress.isAnyLocalAddress());

        // is linkedlocaladress
        System.out.println("is linked to local adress" + inetAddress.isLinkLocalAddress());

         // is it a loop back srssion
        System.out.println("is it a loop back session" + inetAddress.isLoopbackAddress());

        // is sitlelocl adress
        System.out.println("is site local adree: " + inetAddress.isSiteLocalAddress());

        // hash code
        System.out.println("hashcode :" + inetAddress.hashCode());
    }

}