public class MergeTwoArray {
    public static void mrg(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < arr1.length)
            arr3[k++] = arr1[i++];

        while (j < arr2.length)
            arr3[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 22, 23, 34, 45 };
        int[] result = new int[arr1.length + arr2.length];
        mrg(arr1, arr2, result);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
