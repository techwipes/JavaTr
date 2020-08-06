package IPAddr;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class IpConverter {


    public static String ipToBit(String ipAddress) throws UnknownHostException {

        byte[] bytes = InetAddress.getByName(ipAddress).getAddress();
        String data_out = new BigInteger(1, bytes).toString(2);
        return data_out;
    }
}


class TestIP {
    public static void main(String[] args) throws UnknownHostException {
        String ip = "10.10.10.10";
        String result = IpConverter.ipToBit(ip);
        System.out.println(result);


    }
}
