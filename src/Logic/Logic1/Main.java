package Logic.Logic1;

public class Main {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (!isWeekend && cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40);

    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer) {
            return temp >= 60 && temp <= 90;
        } else {
            return temp >= 60 && temp <= 100;
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            }
        } else {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            }
        }
        return 2;
    }

    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        }
        return a + b;
    }

    public String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            switch (day) {
                case 0:
                case 6:
                    return "10:00";
                default:
                    return "7:00";
            }
        } else {
            switch (day) {
                case 0:
                case 6:
                    return "off";
                default:
                    return "10:00";
            }
        }
    }

    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;

    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            return n >= 1 && n <= 10;
        } else {
            return n <= 1 || n >= 10;
        }
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return true;
        }
        if (n % 5 == 0 && n % 3 != 0) {
            return true;
        }
        return false;
    }

    public boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }

    public boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    public int teenSum(int a, int b) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 ? 19 : a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !isMom) {
            return false;
        }
        return true;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea * 2 <= candy || candy * 2 <= tea) {
            return 2;
        }
        return 1;
    }

    public String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') return "FizzBuzz";
        if (str.charAt(0) == 'f') return "Fizz";
        if (str.charAt(str.length() - 1) == 'b') return "Buzz";
        return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || c + b == a || c + a == b;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk) {
            return b > a && c > b;
        } else {
            return c > b;
        }
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk) {
            return a < b && b < c;
        } else {
            return a <= b && b <= c;
        }
    }

    public boolean lastDigit(int a, int b, int c) {
        int count = 0;
        if (a % 10 == b % 10) count++;
        if (a % 10 == c % 10) count++;
        if (b % 10 == c % 10) count++;
        return count >= 1;
    }

    public boolean lessBy10(int a, int b, int c) {
        int count = 0;
        if (Math.abs(a - b) >= 10) count++;
        if (Math.abs(a - c) >= 10) count++;
        if (Math.abs(b - c) >= 10) count++;
        return count >= 1;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == die2) {
                die1++;
                if (die1 == 7) die1 = 1;
            }
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {
        if (a == b && b == c && c == 2) return 10;
        if (a == b && b == c) return 5;
        if (b != a && c != a) return 1;
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a != b && b != c && a != c) return 0;
        if (a == b && b == c) return 20;
        return 10;
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) return 10;
        if (a + b == b + c + 10 || a + b == a + c + 10) return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return a / 10 == b % 10 || b / 10 == a % 10 || a / 10 == b / 10 || a % 10 == b % 10;
    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(sum).length() > String.valueOf(a).length()) {
            return a;
        }
        return sum;
    }

    public static void main(String[] args) {
    }
}
