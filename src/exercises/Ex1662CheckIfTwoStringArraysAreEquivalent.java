package exercises;

public class Ex1662CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {

        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for (String s : arr1) {
            sb1.append(s);
        }
        for (String s : arr2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] arr1 = { "ab", "c" };
        String[] arr2 = { "a", "bc" };
        System.out.println(arrayStringsAreEqual(arr1, arr2));
    }
}
