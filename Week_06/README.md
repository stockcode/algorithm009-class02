#学习笔记

##动态规划的实现及关键点
###分治、回溯、递归、动态规划


####递归模板
```java
    public void recursion(int level, int params) {}
        //terminator
        if (level > MAX_LEVEL) {
            return;
        }   

        //process current logic;
        process(level, param);

        //drill down
        recursion(level + 1, param);

        //restore current state
}   
```

###分治（Divide & Conquer）
```java
public int divide_conquer(problem, param1, param2) {
    //terminator
    if (problem == null) {
        print_result;
        return;
    }
        
    //prepare data
    data = prepare_data(problem);
    subproblem = split_problem(problem, data);

    //conquer subproblems
    subresult1 = divide_conquer(subproblem[0], param1, param2);
    subresult2 = divide_conquer(subproblem[1], param1, param2);
    subresult3 = divide_conquer(subproblem[2], param1, param2);
    
    //process and generate the final result
    result = process_result(subresult1, subresult2, subresult3);
    
    //restore current state
}
```

###感触
* 人脑递归很低效
* 找到最近最简方法，将其拆解成可重复解决的问题
* 数学归纳法思维（抵制人肉递归的诱惑）

#本质：寻找重复性->计算机指令集

###动态规划 Dynamic Programming
* Divide & Conquer + Optimal substructure
* Simplifying a complicated problem by breaking it down into simpler subproblems

####关键点
* 动态规划和递归或者分治没有跟不上的区别（关键看有无最优子结构）
* 共性：找到重复字问题
* 差异性：最优子结构、中途可以淘汰次优解