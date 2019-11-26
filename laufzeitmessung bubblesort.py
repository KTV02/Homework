from time import *
from random import randint
  
def bubblesort(L):
    ende = len(L)
    while ende > 0:
        for i in range(0, ende-1):
            # Vergleichen
            if L[i+1] < L[i]:
                # Aufsteigen
                h = L[i]
                L[i] = L[i+1]
                L[i+1] = h
        ende = ende - 1
    return L

def test(l):
    t1 = clock()
    for i in range(1001000):
        sortiert = bubblesort(l)
    t2 = clock()
    t = t2 - t1
    return t

def start():
    list1=[]
    iterationen=0
    for i in  range(1000):
        iterationen=iterationen+1
        list1=list1+[randint(1,10000)]
        print("Liste mit ",iterationen," Iterationen",test(list1))
        
