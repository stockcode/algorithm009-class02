继承链： PriorityQueue->AbstractQueue->AbstractCollection

内部是通过数组实现
```java
 /**
     * Priority queue represented as a balanced binary heap: the two
     * children of queue[n] are queue[2*n+1] and queue[2*(n+1)].  The
     * priority queue is ordered by comparator, or by the elements'
     * natural ordering, if comparator is null: For each node n in the
     * heap and each descendant d of n, n <= d.  The element with the
     * lowest value is in queue[0], assuming the queue is nonempty.
 */
transient Object[] queue
```

add方法调用了offer方法的实现
```java
    public boolean add(E e) {
        return offer(e);
    }
```
