public class Tester {

  public static void main(String[] args) {
    DataSet dataSet = new DataSet();
    dataSet.display();
    dataSet.doSort();
    dataSet.display();
    dataSet.resetData();
    dataSet.changeStrategy(SortingStrategies.INSERTION_SORT);
    dataSet.doSort();
    dataSet.display();
    dataSet.resetData();
    dataSet.changeStrategy(SortingStrategies.BUBBLE_SORT);
    dataSet.doSort();
    dataSet.display();
  }
}