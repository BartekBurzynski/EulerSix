package pl.javastart.eulersix.service;

public class EulerSixService {
    public static void eulerSix() {
        EulerSixService eulerSixService = new EulerSixService();
        int x = eulerSixService.calc(100);
        System.out.println(x);
    }

    int calc(int x) {
        int sumOfTheSquare = 0;
        int squareOfTheSum = 0;
        for (int i = 1; i <= x; i++) {
            sumOfTheSquare += i * i;
        }
        for (int i = 1; i <= x; i++) {
            squareOfTheSum += i;
        }
        squareOfTheSum *= squareOfTheSum;
        return squareOfTheSum - sumOfTheSquare;
    }

}
