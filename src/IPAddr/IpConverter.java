package IPAddr;

public class IpConverter {


    public static long ipToLong(String ipAddress) {

        String[] ipAddressInArray = ipAddress.split("\\.");

        long result = 0;
        for (int i = 0; i < ipAddressInArray.length; i++) {

            int power = 3 - i;
            int ip = Integer.parseInt(ipAddressInArray[i]);
            result += ip * Math.pow(256, power);

        }

        return result;
    }
}


class TestIP {
    public static void main(String[] args) {
        String ip = "255.255.255.255";
        System.out.println(IpConverter.ipToLong(ip));
    }
}
