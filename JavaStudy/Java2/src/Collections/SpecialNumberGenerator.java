package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class SpecialNumberGenerator {

    /**
     * 첫 n개의 소수를 찾아낸다. n은 1 이상이어야 한다.
     *
     * @param n 주어진 갯수 ( n >=1 )
     * @return 찾은 소수들이 들어 있는 Collection
     */
    public Collection<Long> getPrimes(int n) {
        ArrayList<Long> primeList = new ArrayList<>();

        primeList.add(2L);

        Long nextPrime;
        while (primeList.size() < n) {
            nextPrime = getNextPrime(primeList);
            primeList.add(nextPrime);
        }
        return primeList;
    }

    private long getNextPrime(List<Long> primes) {

        int currIndex = primes.size() - 1;
        long currPrime = primes.get(currIndex);
        long i = currPrime + 1;
        boolean found = false;
        while (!found) {
            int j;
            for (j = 0; j < currIndex; j++)
                if (i % primes.get(j) == 0)
                    break;
            if (j == currIndex)
                found = true;
            else
                i++;
        }
        return i;
    }

    public static void main(String[] args) {

        SpecialNumberGenerator generator = new SpecialNumberGenerator();
        Collection<Long> c = generator.getPrimes(500);

        List<Long> list = new ArrayList<>(c);
        ListIterator<Long> lit = list.listIterator(list.size());

        int count = 0;
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
            if (++count >= 10)
                break;
        }
        System.out.println();
    }
}