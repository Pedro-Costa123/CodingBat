package Array.Array1;

public class Main {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;

    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];

    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        int temp2 = nums[1];
        nums[1] = nums[2];
        nums[0] = temp2;
        nums[2] = temp;
        return nums;
    }

    public int[] reverse3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[2];
        nums[2] = temp;
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int big = nums[0];
        if (big < nums[2]) big = nums[2];
        nums[0] = nums[1] = nums[2] = big;
        return nums;
    }

    public int sum2(int[] nums) {
        int sum = 0;
        for (int i = 0; i < 2 && i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean double23(int[] nums) {
        int count3 = 0;
        int count2 = 0;
        for (int i : nums) {
            if (i == 2) {
                count2++;
            }
            if (i == 3) {
                count3++;
            }
        }
        return count2 >= 2 || count3 >= 2;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
                break;
            }
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length >= 1 && a[0] == 1) count++;
        if (b.length >= 1 && b[0] == 1) count++;
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < 2; i++) {
            sumA += a[i];
            sumB += b[i];
        }
        return sumA >= sumB ? a : b;
    }

    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] newOne = new int[4];
        newOne[0] = a[0];
        newOne[1] = a[1];
        newOne[2] = b[0];
        newOne[3] = b[1];
        return newOne;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int[] newOne = new int[3];
        newOne[0] = nums[nums.length / 2 - 1];
        newOne[1] = nums[nums.length / 2];
        newOne[2] = nums[nums.length / 2 + 1];
        return newOne;
    }

    public int maxTriple(int[] nums) {
        int big = nums[0];
        if (nums[nums.length / 2] > big) big = nums[nums.length / 2];
        if (nums[nums.length - 1] > big) big = nums[nums.length - 1];
        return big;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 1) return nums;
        int[] array = new int[2];
        array[0] = nums[0];
        array[1] = nums[1];
        return array;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        } else if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
            return true;
        } else if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
            return true;
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int aLength = a.length;

        if (aLength >= 2) {
            result[0] = a[0];
            result[1] = a[1];
        } else if (aLength == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else {
            result[0] = b[0];
            result[1] = b[1];
        }

        return result;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0) {
            if (b.length > 0) {
                return new int[]{b[0]};
            } else {
                return new int[]{};
            }
        }
        if (b.length == 0) {
            return new int[]{a[0]};
        }

        return new int[]{a[0], b[0]};
    }

    public static void main(String[] args) {

    }
}
