public class HelloWorld {
    static int addAsStrings(int n1, int n2){
        Integer i1 = n1;
        Integer i2 = n2;
        String s1 = i1.toString();
        String s2 = i2.toString();
        String s3 = s1 + s2;
        int result = Integer.parseInt(s3);
        return result;
    }

    static String textGrade(int grade){
        if (grade == 0){
            String s = "не оценено";
            return s;
        }
        else if (grade >= 1 && grade <= 20){
            String s = "очень плохо";
            return s;
        }
        else if (grade >= 21 && grade <= 40){
            String s = "плохо";
            return s;
        }
        else if (grade >= 41 && grade <= 60){
            String s = "удовлетворительно";
            return s;
        }
        else if (grade >= 61 && grade <= 80){
            String s = "хорошо";
            return s;
        }
        else if (grade >= 81 && grade <= 100) {
            String s = "отлично";
            return s;
        }
        else {
            String s = "не определено";
            return s;
        }
    }

    static long factorial(long n) {
        if (n > 0){
            long k = 1L;
            for (long i = 0L; i < n; i++){
                k = k * (i + 1L);
            }
            return k;
        }
        else {
            long k1 = 1L;
            return k1;
        }
    }

    public static void main(String[] args) {
        int i = addAsStrings(12, 44);
        System.out.println(i);
        String s = textGrade(101);
        System.out.println(s);
    }
}
