package ExtMyList;

public class ExtMyList<E> implements MyList<E> {

    private Object[] data;
    private int size = 0;
    private static final int FIRSTNUM = 10;


    //对ArrayList初始化容量
    public ExtMyList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("初始化容量不能小于0");
        }
        this.data = new Object[initialCapacity];
    }

    public ExtMyList() {
        this(FIRSTNUM);
    }

    //数组扩容
    public void expansion() {
        if (size == data.length) {
            Object[] newData = new Object[size * 2 + 1];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    //添加元素
    @Override
    public void add(E e) {
        expansion();
        data[size] = e;
        this.size++;
    }

    //移除指定位置的元素
    @Override
    public void remove(int index) {
        int numMoved = size - index;
        if (numMoved > 0) {
            System.arraycopy(data, index + 1, data, index, numMoved);
            size--;
        }
    }

    //查找指定位置的元素
    @Override
    public E find(int index) {
        return (E) data[index];
    }

    //将指定位置的元素进行修改
    @Override
    public void revise(int index, E e) {
        this.data[index] = e;
    }

    //集合大小
    @Override
    public int size() {
        return this.size;
    }

    //获取指定位置元素
    @Override
    public E get(int index) {
        E data = (E) this.data[index];
        return data;
    }

    //将指定区间的
    @Override
    public void intervalDelete(int friIndex, int laIndex) {
        int copy = size - laIndex;
        System.arraycopy(data, laIndex, data, friIndex + 1, copy);
        size = size - (laIndex - friIndex) + 1;
    }
}
