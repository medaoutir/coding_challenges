package dichotomicSearch;

public class DichotomicSearch {

    public int searchIndex(int[] tabSorted, int val) {
        int start = 0;
        int end = tabSorted.length-1;
        int middle = (start+end)/2;
        while(start < end && start >=0 && end < tabSorted.length && tabSorted[middle]!=val)
        {
            if(tabSorted[middle] < val){
                start = middle+1;
            }
            else {
                end = middle-1;
            }
            middle = (start+end)/2;
        }
        if(tabSorted[middle]==val)
            return middle;
        return -1;
    }

}
