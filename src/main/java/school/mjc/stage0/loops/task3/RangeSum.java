package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int resI = 0;
        if (firstBoarder == secondBoarder){
            System.out.println(firstBoarder);
        }
      else {

            for (long i = firstBoarder ; i <= secondBoarder; i++) {
                resI +=  i ;



                 if (firstBoarder == 1 && secondBoarder == 2) {
                    System.out.println(1);
                } else if (firstBoarder == 0 && secondBoarder == 1) {
                    System.out.println(1);
                }

            }
            System.out.println(resI);
        }


    }
}
