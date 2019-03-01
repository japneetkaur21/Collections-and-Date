import java.util.*;

class SortComparator implements Comparator<Integer> {
    private Map<Integer, Integer> fmap;
    public SortComparator(Map<Integer, Integer> map) {
        this.fmap = map;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int fcomp = fmap.get(o1).compareTo(fmap.get(o2));
        int vcomp = o1.compareTo(o2);
        return fcomp == 0 ? 0 : fcomp;
    }
}


public class Print_elements_of_array_in_decreasing_order {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,3,3,2,2,4};
        System.out.println("Current Array");
        for (int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        int count = 1;
        for (int i = 0 ; i < arr.length;i++){
            list.add(arr[i]);
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],count);
        }
        System.out.println();
        System.out.println("Sorted Array in Sorted Frequency: ");
        SortComparator sc = new SortComparator(map);
        Collections.sort(list,sc);
        System.out.println(list);
    }

}
