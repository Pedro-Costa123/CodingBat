package Warmup.Warmup1;

public class Main {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    public int diff21(int n) {
        int dif = Math.abs(n - 21);
        if (n > 21) {
            return dif * 2;
        }
        return dif;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (hour < 7 || hour > 20) && talking;
    }

    public boolean makes10(int a, int b) {
        return 10 == a || 10 == b || a + b == 10;
    }

    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            return a < 0 && b > 0 || b < 0 && a > 0;
        } else {
            return a < 0 && b < 0;
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    public String missingChar(String str, int n) {
        return new StringBuilder(str).deleteCharAt(n).toString();
    }

    public String frontBack(String str) {
        if (str.length() == 1) return str;
        if (str.length() <= 1) return str;
        char init = str.charAt(0);
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(0, str.charAt(str.length() - 1));
        stringBuilder.setCharAt(str.length() - 1, init);
        return stringBuilder.toString();
    }

    public String front3(String str) {
        String sub;
        if (str.length() <= 3) {
            return str + str + str;
        } else {
            sub = str.substring(0, 3);
            return sub + sub + sub;
        }
    }

    public String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0;
    }

    public boolean in1020(int a, int b) {
        return a >= 10 && a <= 20 || b >= 10 && b <= 20;

    }

    public boolean hasTeen(int a, int b, int c) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }

    public boolean loneTeen(int a, int b) {
        if (a >= 13 && a <= 19 && (b < 13 || b > 19)) {
            return true;
        } else return b >= 13 && b <= 19 && (a < 13 || a > 19);
    }

    public String delDel(String str) {
        if (str.startsWith("del", 1)) {
            return str.replace("del", "");
        }
        return str;
    }

    public boolean mixStart(String str) {
        return str.startsWith("ix", 1);
    }

    public String startOz(String str) {
        String sub = "";

        if (str.isEmpty()) {
            return sub;
        }
        if (str.charAt(0) == 'o') {
            sub += 'o';
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            sub += 'z';
        }

        return sub;
    }

    public int intMax(int a, int b, int c) {
        int big = a;
        if (big < b) {
            big = b;
        }
        if (big < c) {
            big = c;
        }
        return big;
    }

    public int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else if (Math.abs(a - 10) > Math.abs(b - 10)) {
            return b;
        } else {
            return 0;
        }
    }

    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50);

    }

    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'e') count++;
        }
        return count >= 1 && count <= 3;
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();

    }

    public String everyNth(String str, int n) {
        if (str.length() <= n) {
            return String.valueOf(str.charAt(0));
        }

        String newStr = "";
        for (int i = 0; i < str.length(); i += n) {
            newStr += str.charAt(i);
        }

        return newStr;
    }

    public static void main(String[] args) {

    }

}
