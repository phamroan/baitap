public class thuattoan {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 70, 79};

    static int BinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch(list,2));
        System.out.println(BinarySearch(list,11));
        System.out.println(BinarySearch(list,80));
    }

}


