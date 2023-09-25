package String.String1;

public class Main {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        String substring = str.substring(str.length() - 2);
        return substring + substring + substring;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) return str;

        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        String shor = "";
        String lon = "";
        if (a.length() > b.length()) {
            shor = b;
            lon = a;
        } else {
            shor = a;
            lon = b;
        }

        return shor + lon + shor;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        String begin = str.substring(0, 2);
        str = str.replace(begin, "");
        return str + begin;
    }

    public String right2(String str) {
        String end = str.substring(str.length() - 2);
        str = str.replace(end, "");
        return end + str;
    }

    public String theEnd(String str, boolean front) {
        return (front ? str.substring(0, 1) : str.substring(str.length() - 1));
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) return "";
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (str.length() <= 2) return str;
        int end = (Math.min(index + 2, str.length()));
        if (index < 0 || index > str.length() || str.substring(index, end).length() < 2) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, end);
        }
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) return false;

        String subStr = str.substring(0, str.length() < 4 ? 3 : 4);

        return subStr.contains("bad");
    }

    public String atFirst(String str) {
        if (str.isEmpty()) return str + "@" + "@";
        if (str.length() < 2) return str + "@";
        return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        String newStr = "";
        if (!a.isEmpty()) {
            newStr += a.charAt(0);
        } else {
            newStr += "@";
        }
        if (!b.isEmpty()) {
            newStr += b.charAt(b.length() - 1);
        } else {
            newStr += "@";
        }
        return newStr;
    }

    public String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a + b;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        if (str.length() < 2) return str;
        return new StringBuilder(str).deleteCharAt(str.length() - 2).toString() + str.charAt(str.length() - 2);
    }

    public String seeColor(String str) {
        if (str.startsWith("blue")) {
            return "blue";
        }
        if (str.startsWith("red")) {
            return "red";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

    public String minCat(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int minLen = Math.min(len1, len2);
        String trimmedStr1 = a.substring(len1 - minLen);
        String trimmedStr2 = b.substring(len2 - minLen);

        return trimmedStr1 + trimmedStr2;
    }

    public String extraFront(String str) {
        String sub = "";
        if (str.length() < 2) {
            sub = str;
        } else {
            sub = str.substring(0, 2);
        }
        return sub + sub + sub;
    }

    public String without2(String str) {
        if (str.length() < 2) return str;
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    public String deFront(String str) {
        if (!str.isEmpty()) {
            String newStr = str.substring(2);
            if (str.charAt(1) == 'b') {
                newStr = 'b' + newStr;
            }
            if (str.charAt(0) == 'a') {
                newStr = 'a' + newStr;
            }
            return newStr;
        }
        return str;
    }

    public String startWord(String str, String word) {
        if (str.isEmpty()) return str;

        if (word.length() == 1) {

            return str.substring(0, 1);

        } else {
            int pos = str.indexOf(word.substring(1));
            if (pos == 1) {
                return str.substring(0, word.length());
            }
        }
        return "";
    }

    public String withoutX(String str) {
        if (str.isEmpty() || str.length() == 1) return "";
        StringBuilder stringBuilder = new StringBuilder(str);
        if (stringBuilder.charAt(0) == 'x') {
            stringBuilder.deleteCharAt(0);
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == 'x') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public String withoutX2(String str) {
        if (str.isEmpty()) return "";
        StringBuilder stringBuilder = new StringBuilder(str);
        if (str.length() >= 2) {
            if (stringBuilder.charAt(0) == 'x' && stringBuilder.charAt(1) == 'x') {
                stringBuilder.delete(0, 2);
                return stringBuilder.toString();
            }
            if (stringBuilder.charAt(1) == 'x') {
                stringBuilder.deleteCharAt(1);
                return stringBuilder.toString();
            }
        }
        if (stringBuilder.charAt(0) == 'x') {
            stringBuilder.deleteCharAt(0);
            return stringBuilder.toString();
        }
        return str;
    }

    public static void main(String[] args) {

    }
}
