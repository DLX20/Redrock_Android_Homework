import ExtMyList.ExtMyList;

public class Main {
    public static void main(String[] args) {

        ExtMyList<Integer> nList = new ExtMyList<Integer>();        //实例ExtMyList
        ExtMyList<String> sList = new ExtMyList<String>();

        //添加
        sList.add("a");
        sList.add("b");
        sList.add("c");
        sList.add("d");

        for (int i = 0; i < 12; i++) {
            nList.add(i);
        }

        //输出
        System.out.print("sList集合：");
        for (int i = 0; i < sList.size(); i++) {
            System.out.print(sList.get(i) + ",");
        }
        System.out.print("\n"+"nList集合：");
        for (int i = 0; i <nList.size() ; i++) {
            System.out.print(nList.get(i)+",");
        }
        System.out.println();
        System.out.println("sList集合的大小："+sList.size());       //输出集合大小
        System.out.println("nList集合的大小："+nList.size());

        sList.remove(2);        //移除
        System.out.print("sList集合移除下标为2的元素后：");
        for (int i = 0; i < sList.size(); i++) {
            System.out.print(sList.get(i) + ",");
        }
        System.out.println();

        System.out.println("nList集合下标为3的元素为："+nList.find(3));
        nList.revise(0, 99);
        System.out.print("修改后的nList集合：");
        for (int i = 0; i < nList.size(); i++) {
            System.out.print(nList.get(i) + ",");
        }
        System.out.println();
        nList.intervalDelete(2,6);

        System.out.print("删除区间在2-6的nList集合：");
        for (int i = 0; i < nList.size(); i++) {
            System.out.print(nList.get(i)+",");
        }
    }
}
