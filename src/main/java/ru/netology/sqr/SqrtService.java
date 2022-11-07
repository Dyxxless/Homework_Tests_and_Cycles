package ru.netology.sqr;

public class SqrtService {
    public int rangeSqrLimit(int begin, int end) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= begin & i * i <= end) {
                amount++;
                System.out.println(i);
            }
            if (i * i > end) {
                break;
            }
        }
        return amount;
    }
}
