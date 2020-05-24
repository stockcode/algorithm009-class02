学习笔记

##第三课
###第一节：数组、链表、跳表的基本实现和特性

####1、Array

内存是连续的，可以随机访问

讲解ArrayList源码

#####时间复杂度：
prepend     O(1)

append      O(1)

lookup      O(1)

insert      O(n)

delete      O(n)

####2、Linked List

内存不是连续的，分单链表，双链表，循环链表

```java
class LinkedList {
  Node head;

  class Node {
    int data;
    Node next;
    
    Node(int d) { data = d};

  }
}
```

解读Java LinkedList源码 -> 双向循环链表

#####时间复杂度：
prepend     O(1)

append      O(1)

lookup      O(n)

insert      O(1)

delete      O(1)


###3、Skip List跳表

前提是链表的元素是有序的。

Redis、LevelDB等项目使用跳表来替代平衡树。

一维数据结构可以升维变成二维数据结构进行加速

查询时间复杂度：O(logn)
空间复杂度：O(n)

###小结
* 数组、链表、跳表的原理和实现
* 三者的时间复杂度、空间复杂度
* 工程运用
* 跳表：升维思想+空间换时间


###第二节实战题目解析：移动零

####练习步骤

1、5-10分钟：读题和思考

2、有思路：自己开始做和写代码；不然，马上看题解！

3、默写背诵、熟练

4、然后开始自己写（闭卷）

多想几种解法

需要五遍刷题法，50%，feedback，看官方解题方法，
看几个排名靠前的解法，切换到国际站，看国外网友的精彩解法。

###第三节实战题目解析：盛最多水的容器

解法1、完全枚举：left bar, right bar, (x-y) * height_diff 时间复杂度：O(n^2)
```java
class Solution {
    public int maxArea(int[] a) {
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                int area = (j - i) * Math.min(a[i], a[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
```
解法2、双下标，左右加逼法，时间复杂度：O(n)
```java
class Solution {
    public int maxArea(int[] a) {
        int max = 0;
        for(int i = 0, j = a.length - 1; i < j;) {
            int minHeight = a[i] < a[j] ? a[i++] : a[j--];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }
}
```

###第三节实战题目解析：爬梯子

懵逼的时候：暴力？基本情况

找最近重复子问题

if else, for while, recursion

1：1

2：2

3： f(1) + f(2)

4: f(2) f(3)

f(n) = f(n -1) + f(n - 2) : Fibonacci

```java
class Solution {
    public int climbStairs(int n) {
        if (n < 3) return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}
```

解题思路就是找重复性