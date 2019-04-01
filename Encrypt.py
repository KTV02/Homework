from random import *
vocals="aeiouAEIOU"
def removeVocals(content):
    konsonanten=""
    for x in content:
        if not x in vocals: 
            konsonanten+=x
    return konsonanten

def replaceVocals(content):
    replaced=""
    for  x in content:
        if x in vocals:
            replaced+=str(randint(0,1000))
        else:
            replaced+=x
    return replaced

def replaceEverySecondChr(content):
    zweitenWeg=""
    counter=0;
    for x in content:
        if counter % 2 == 0:
            zweitenWeg+=x
        counter += 1   
    return zweitenWeg

def reverse(content):
    return content[::-1]

def reverseUncool(content):
    reverse=""
    for x in content:
        reverse = x + reverse
    return reverse    

def rotate(content,rotation):
    rotated=""
    for x in content:
        lowerasci=ord(str.lower(x))
        if 96<lowerasci<(123-rotation):
            rotated+=chr(lowerasci+ rotation)
        elif 123>lowerasci>(123-rotation):
            rotated+=chr(lowerasci+rotation-26)
        else:
            rotated+=" "
    return rotated

def caesar(content):
    return rotate(content,2)
