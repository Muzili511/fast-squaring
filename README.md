![image](https://github.com/user-attachments/assets/4d39babd-2a27-4dc4-8490-b2b584130cbd)
引入非递归的快速幂。如果要计算7的10次方，把10写成二进制的形式，也就是 
（1010）
现在我们要计算 7的（1010）（二进制），可以怎么做？
1010的最后一位是0，所以a^1这一位不要。然后1010变为101，a变为a^2。
101的最后一位是1，所以a^2这一位是需要的，乘入结果。101变为10，a再自乘。
10的最后一位是0，跳过，右移，自乘。
然后1的最后一位是1，ans再乘上a^8。循环结束，返回结果。
因此我们只需不断把底数平方就可以算出它们。
这样，我们就得出了在O(log n)的时间内计算幂的方法
