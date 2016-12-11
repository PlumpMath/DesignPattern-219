package designPattern.Adapter;

/**
 * Created by cctv on 2016/12/11.
 * 抽象成绩操作类
 */
public interface ScoreOperation {
    int[] sort(int array[]);//成绩排序
    int search(int array[],int k);//成绩查找
}
