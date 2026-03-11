public class PracticeProblem {

public static int[] compareSearch(int[] array, int number) {
    int sequentialLoops = 0;
    int binaryLoops = 0;


    for (int i = 0; i < array.length; i++) {
        sequentialLoops++;
        if (array[i] == number) {
            break;
        }
    }

    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
        binaryLoops++;
        int mid = (low + high) / 2;

        if (array[mid] == number) {
            break;
        } else if (array[mid] < number) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return new int[]{sequentialLoops, binaryLoops};
}
	public static int[] compareStringSearch(String[] array, String word) {

    int sequentialLoops = 0;
    int binaryLoops = 0;


   		for (int i = 0; i < array.length; i++) {
        	sequentialLoops++;
        	if (array[i].equals(word)) {
            	break;
        	}
    	}

    	int left = 0;
    	int right = array.length - 1;

    	while (left <= right) {
        	binaryLoops++;

        	int mid = (left + right) / 2;

        	int compare = array[mid].compareTo(word);

        	if (compare == 0) {
            	break;
        	}
        	else if (compare < 0) {
            	left = mid + 1;
        	}
        	else {
            	right = mid - 1;
        	}
    	}

    	int[] result = new int[2];
    	result[0] = sequentialLoops;
    	result[1] = binaryLoops;

    	return result;
	} 
}
