package ExtMyList;

public interface MyList<E> {

    void add(E e);       //增

    void remove(int index);         //删

    int size();          //获取集合大小

    void revise(int index, E e);      //指定位置修改

    E find(int index);       //查找指定位置元素

    E get(int index);        //获取元素

    void intervalDelete(int friIndex,int laIndex);      //删除指定区间内的元素（闭区间）

}
