package For.practice;

public class ForPractice2 {
	public static void main(String[] args) {
		
		int arr[] = {5,7,2,6,2,1,9,0,7};
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int e:arr) {
			System.out.println(e);
		}
		
		
	}

}
