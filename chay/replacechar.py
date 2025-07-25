def replacechar(n):
    if len(n)<1:
        return  n
    else:
        if n[0]=='x':
            return "y"+replacechar(n[1:])
        else:
            return n[0]+replacechar(n[1:])
    
n=input()
print(replacechar(n)) 