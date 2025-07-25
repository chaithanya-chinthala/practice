# n=input()
# print(n.replace("pi","3.14"))



# n=input()
# str=""
# i=0
# while(i<len(n)):
#     if  i<len(n)-1 and n[i]=="p" and n[i+1]=='i' :
#         str+="3.14"
#         i+=2
#     else:
#         str+=n[i]
#         i+=1
# print(str)

def replacepi(n):
    if(len(n)<=1):
        return n
    elif n[0]=='p' and n[1]=='i':
        return "3.14"+replacepi(n[2:])
    else:
        return n[0]+replacepi(n[1:])
    
n=input()
print(replacepi(n))
