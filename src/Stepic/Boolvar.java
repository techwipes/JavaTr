package Stepic;

public class Boolvar {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean[] result = {a, b, c, d};
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == true) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}


/*

another way:

public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    return ((a?1:0) + (b?1:0) + (c?1:0) + (d?1:0)) == 2;
}

another way, compact

public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    int trueCount = 0;
	for(boolean variable : new Boolean[]{a, b, c, d})
	    if(variable) trueCount++;
    return trueCount == 2;
}


 */