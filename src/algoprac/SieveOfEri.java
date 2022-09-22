package algoprac;

public class SieveOfEri {
    public int countPrimes(int n) {
        boolean setOfIntegers[] = new boolean[n];
        int total = 0;
        if (n <2){
            return 0;
        }
        for (int eachInteger = 3; eachInteger <= Math.sqrt(n); eachInteger+=2) {
            if (!setOfIntegers[eachInteger]) {
                int multiple = 2;
                int temp= multiple * eachInteger;
                while (multiple <= n) {
                    temp = multiple * eachInteger;
                    if(temp < n)
                        setOfIntegers[temp] = true;
                    multiple++;
                }
            }
        }
        for(int inf =2; inf < setOfIntegers.length; inf++){
            if(!setOfIntegers[inf]){
                System.out.println(inf);
                total++;
            }
        }

        return total;
    }

    public static void main(String args[]){
        SieveOfEri e = new SieveOfEri();
        int res = e.countPrimes(6

        );

        System.out.println("\t"+res);
        for(int i=0;i<100;i++){
            res = e.countPrimes(i);

            System.out.println("\t"+res);
        }
    }
}
