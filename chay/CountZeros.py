# n=input()
# c=0
# for i in n:
#     if i=='0':
#         c+=1
# print("No of zeros:",c)

def CountZeros(n):
    if n=="":
        return 0
    elif n[0]=='0':
        return 1+CountZeros(n[1:])
    else:
        return CountZeros(n[1:])
n=input()
print(CountZeros(n))