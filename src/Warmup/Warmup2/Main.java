package Warmup.Warmup2;

public class Main {

    public String stringTimes(String str, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(str);
        }
        return builder.toString();
    }

    public String frontTimes(String str, int n) {
        String newStr = "";


        for (int i = 0; i < n; i++) {
            if (str.length() <= 3) {
                newStr += str;
            } else {
                newStr += str.substring(0, 3);
            }
        }

        return newStr;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                if (i + 1 < str.length()) {
                    if (str.charAt(i + 1) == 'x') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        int first = str.indexOf('x');
        if (first + 1 < str.length()) {
            return str.charAt(first + 1) == 'x';
        }
        return false;
    }

    public String stringBits(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    public int last2(String str) {
        if (str.length() <= 2) return 0;
        int count = 0;
        String last2 = str.substring(str.length() - 2);
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 <= str.length()) {
                if (str.substring(i, i + 2).equals(last2)) {
                    count++;
                }
            }
        }
        return count - 1;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && i + 2 < nums.length) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int size = Math.min(a.length(), b.length());
        for (int i = 0; i < size - 1; i++) {
            String sub1 = a.substring(i, i + 2);
            String sub2 = b.substring(i, i + 2);
            if (sub2.equals(sub1)) count++;
        }
        return count;
    }

    public String stringX(String str) {
        if (str.length() <= 1) return str;
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 1; i < stringBuilder.length() - 1; i++) {
            if (stringBuilder.charAt(i) == 'x') {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }

        return stringBuilder.toString();
    }

    public String altPairs(String str) {
        if (str.length() <= 1) return str;
        String newStr = "";
        int pair1 = 0;
        int pair2 = 1;
        while (true) {
            if (pair1 < str.length()) {
                newStr += str.charAt(pair1);
            }
            if (pair2 < str.length()) {
                newStr += str.charAt(pair2);
            } else {
                break;
            }
            pair1 += 4;
            pair2 += 4;
        }
        return newStr;
    }

    public String stringYak(String str) {
        return str.replace("yak", "");
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        boolean doesNot = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                doesNot = false;
                break;
            }
        }
        return doesNot;
    }

    public boolean has271(int[] nums) {
        boolean contains = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 5 == nums[i + 1] && Math.abs((nums[i] - 1) - nums[i + 2]) <= 2) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public static void main(String[] args) {

    }
}
