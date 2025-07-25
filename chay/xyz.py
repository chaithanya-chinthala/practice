#length of the last string  in the list
# x=list(input().split())
# y=x[-1]
# print(len(y))

#count of the words Startinf with capital letters
# x=list(input().split())
# c=0
# for i in x:
#     if(i[0].isupper()):
#         c+=1
# print(c)


# Longest wortd in a sentence
# x=list(input().split())
# long=""
# for i in x:
#     if len(i)>len(long):
#         long=i
# print(long)

# #Anagram
# s=input()
# s1=input()
# if(sorted(s)==sorted(s1)):
#     print("True")
# else:
#     print("False")

# x=[9,2,3,4]
# y="hello"
# print(x.sort())
# print(sorted(y))
# z=sorted(y)
# print(z)
#print the longest odd length string in the array  otherwise print best of luck
# x=list(input().split())
# longest=""
# for i in x:
#     if len(i)%2==1:
#         if(len(i)>len(longest)):
#             longest=i
# if(longest==""):
#     print("Best of luck")
# else:
#     print(longest)
# count the vowels and consonants in a string
# s=input()
# vow="aeiou"
# v_c=0
# c_c=0
# con=""
# for i in s:
#     if i.lower() in vow:
#         v_c+=1
#     else:
#         c_c+=1
# print(f"vowel count: {v_c}")
# print("consonants count :",c_c)
#palindrome of string
# s=input().lower()
# n=s
# if(s[::-1]==n):
#     print("Palindrome")
# else:
#     print("NMot a palindrome")
#
#print the no of groups that can be formed from the list consider $,@ as devils
# s=input()
# c=1
# for i in range(1,len(s)):
#     if s[i]!=s[i-1]:
#         c+=1
# print(c)
#multiplication

