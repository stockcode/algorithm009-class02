
Queue的源码如下
```
public interface Queue<E> extends Collection<E> {
    boolean add(E e);

    boolean offer(E e);

    E remove();

    E poll();

    E element();

    E peek();
}
```

从代码来看，Queue是一个接口，不是具体的类实现。
Queue继承链：Queue->Collection->Iterable
##方法分析
方法add和offer都是添加元素，差别是offer不抛异常，add抛异常，推荐使用offer。

方法remove和poll都是取出并移除元素，差别是remove会抛异常，而poll返回null，不抛异常。

方法element和peek都是取出元素，差别是element会抛异常，而peek返回null，不抛异常。


