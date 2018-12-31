'''
Created on 2018年11月9日

@author: YANG
'''

def make_increament(n):
    return lambda x:x+n

f=make_increament(42)
print(f(0))
print(f(22))

dic1 = {"faf":3,"fafa":5}



