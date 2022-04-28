public class Sorting {
    public static void main(String[] args) {
        int numbers[] ={4,3,5,6,1,2};
        //String numbers[] = {"4", "3", "5", "6", "1", "2"};
        int i = 0, l = 0;
        int temp;
        String flag = "true";
        //System.out.println(numbers.length);
        try {
            do {
                if (numbers[i] == null) {
                    l++;
                    //System.out.println(l);
                    i++;
                } else
                    i = -1;
            } while (i != -1);

        } catch (Exception e) {

        }

    }


    public void sort(int l, String ar[]) {
        int k = 0, temp;
        while (k <= (l - 2)) {

            while (k <= l - 2) {

                if (ar[k] > ar[k + 1]) {
                    temp = ar[k];
                    ar[k] = ar[k + 1];
                    ar[k + 1] = temp;
                }
                System.out.println(ar[k]);
                k++;
            }
        }
    }
}