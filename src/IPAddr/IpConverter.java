package IPAddr;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IpConverter {


    public static String ipToInt(String ipAddress) throws UnknownHostException {

        byte[] bytes = InetAddress.getByName(ipAddress).getAddress();
        String data_out = new BigInteger(1, bytes).toString(2);
        return data_out;
    }
}


class TestIP {
    public static void main(String[] args) throws UnknownHostException {
        String ip = "255.255.255.2";
        String result = IpConverter.ipToInt(ip);
        System.out.println(result);

    }
}
