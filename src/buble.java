import java.util.Arrays;

public class buble {
	public static void main(String[] args) {
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		Arrays.sort(a);
		 
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

		for (int i = 0; i < a.length; i++) {

			for (int j2 = i + 1; j2 < a.length; j2++) {
				if (a[i] > a[j2]) {
					int j = a[i];
					a[i] = a[j2];
					a[j2] = j;
				}
			}
		}

		int b[] = new int[] { 18, 62, 68, 82, 65, 9 };
		for (int j = 0; j < b.length; j++) {

			for (int i = 0; i < b.length - 1; i++) {
				if (b[i] > b[i + 1]) {
					int temp = b[i];
					b[i] = b[i + 1];
					b[i + 1] = temp;
				}

			}
			for (int j2 = 0; j2 < b.length; j2++) {
				System.out.print(b[j2] + " ");
			}
			System.out.println();
		}

	}
}
