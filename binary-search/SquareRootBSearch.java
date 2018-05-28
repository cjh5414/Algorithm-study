public class SquareRootBSearch {
    public static int squareRootLoop(int num) {
        for (int i=0; i<num; i++)
            if (i * i == num)
                return i;
        return -1;
    }

    public static int squareRootBSearch(int num) {
        int min = 0;
        int max = num;
        int guess;

        while (min <= max) {
            guess = (min + max) / 2;
            if (guess * guess == num)
                return guess;
            else if (guess * guess > num)
                max = guess - 1;
            else
                min = guess + 1;
        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println("sqr(16) = " + squareRootLoop(16));
        System.out.println("sqr(30) = " + squareRootLoop(30));
        System.out.println("sqr(100) = " + squareRootLoop(100));

        System.out.println("sqr(16) = " + squareRootBSearch(16));
        System.out.println("sqr(30) = " + squareRootBSearch(30));
        System.out.println("sqr(100) = " + squareRootBSearch(100));
    }
}

