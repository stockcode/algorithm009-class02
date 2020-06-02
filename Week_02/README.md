学习笔记
#第二周 第5课
##1、哈希表、映射、集合的实现与特性

Hash table通过Hash Function和Array来实现。

key --> hashing function --> index --> array

hash collisions --> chaining

* insert --> O(1)
* search --> O(1)
* delete --> O(1)

HashMap 个人分析

#第二周 第6课
##1、树、二叉树、二叉搜索树的实现和特性

Root->Child Node

二叉树：只有左儿子、右儿子。

* Linked List 是特殊化的Tree
* Tree是特殊化的Graph

###二叉树遍历
* 前序遍历(Pre-order): 根-左-右
```python
def preorder(self, root):
  if root:
    self.traverse_path.append(root.val)
    self.preorder(root.left)
    self.preorder(root.right)
```
* 中序遍历(In-order)：左-根-右
```python
def inorder(self, root):
  if root:
    self.inorder(root.left)
    self.traverse_path.append(root.val)    
    self.inorder(root.right)
```
* 后序遍历(Post-order) 左-右-根
```python
def postorder(self, root):
  if root:
    self.postorder(root.left)
    self.postorder(root.right)
    self.traverse_path.append(root.val)        
```

###二叉搜索树 Binary Search Tree
1. 左子树上所有节点的值均小于他的根节点的值；
2. 右子树上所有节点的值均大于他的根节点的值；
3. 以此类推：左、右子树也分别为二叉查找树。
4. 中序遍历：升序排列

##2、堆和二叉堆的实现和特性
