# n=int(input())
# n1=int(input())
# x=int(input())
# print(n,n1,end=" ")
# for i in range(x):
#     c=n+n1 
#     print(c,end=" ")
#     n=n1
#     n1=c 
def fib(n):
    if(n==0):
        return 0
    elif n==1:
        return 1
    else:
        fib(n-2)+fib(n-1)
n=int(input())

