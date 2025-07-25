n=input()
str=""
max_str=""
for i in n:
    if i not in str:
        str+=i
    else:
        if len(str)>len(max_str):
            max_str=str                                                                                                                      
        str=i
if(len(str)>len(max_str)):
    max_str=str
print(max_str)