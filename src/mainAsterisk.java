class printNAsterisk {
    private int NumAsterisk = 0;
    private int i = 0;
    private int j = 0;

    // set N with user prompt

    public void setN (int N) {
        if (0 < N || N < 100) {
            NumAsterisk = N;
        }
    }

    public int getN () {
        return NumAsterisk;
    }

    // print one asterisk

    public void pOneAsterisk () {
        System.out.println("Printing one asterisk");
        System.out.println("*"); // print one asterisk
    }

    // print N * on N lines


    public void pNAsteriskNLine () {
        System.out.println("Printing "+NumAsterisk+" Asterisks on "+NumAsterisk+" Lines");
        for (i = 0; i < NumAsterisk; i++) {
            System.out.println("*");
        }
    }

    // print N asterisks on one line

    public void pNAsterisk () {
        System.out.println("Printing " + NumAsterisk + " Asterisks on one line");
        for (i = 0; i < NumAsterisk - 1; i++) {
            System.out.print("*");
        }
        System.out.println("*");
    }

    // print N++ asterisks (like a staircase)

    public void pNAsteriskPlus () {
        System.out.println("Printing a staircase with "+NumAsterisk+" steps");
        for (i = 0; i < NumAsterisk; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
                System.out.println("*");
        }
     }
}

public class mainAsterisk {
    public static void main(String[] args) {

        printNAsterisk one = new printNAsterisk(); // print N asterisks on N lines
        one.setN(5);
        System.out.println("The user chose N = "+one.getN());
        one.pOneAsterisk();
        one.pNAsteriskNLine();
        one.pNAsterisk();
        one.pNAsteriskPlus();
    }
}