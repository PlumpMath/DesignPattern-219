package designPattern.Adapter;

/**
 * Created by cctv on 2016/12/11.
 * 对象适配器,可以通过配置xml读取文件进行反射产生该对象,进行类之间的解耦
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort sortObj; //定义适配者QuickSort对象
    private BinarySearch searchObj; //定义适配者BinarySearch对象

    public OperationAdapter(){
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    public int search(int[] array, int k) {
        return searchObj.binarySearch(array,k);
    }
}
