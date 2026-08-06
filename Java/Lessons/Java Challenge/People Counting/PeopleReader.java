public class PeopleReader {

    private static int count = 0;
    private static final String access1 = "IN";
    private static final String access2 = "OUT";

    public static int InOut(String[] InOut) {
        for (int i = 0; i < InOut.length; i++) {

            if (InOut[i].equals(access1)) {
                count++;
            } else if (InOut[i].equals(access2)) {
                count--;
                if (count < 0) {
                    count = 0;
                }
            }

            System.out.printf("%d. %s = %d %n", i + 1, InOut[i], count);

        }

        if (count == 0) {
            System.out.printf(" In inside of the building has %d people. %n", count);
        } else if (count == 1) {
            System.out.printf(" In inside of the building has %d person. %n", count);
        } else {
            System.out.printf(" In inside of the building has %d people. %n", count);
        }

        return 0;
    }
}
