from turtle import *

left(90)
def pythagoras(l):
    if(l>5):
        forward(l)
        right(45)
        pythagoras(l/2)
        left(90)
        forward(l/2)
        pythagoras(l/2)
        left(90)
        forward(l)
        left(45)
        forward(l)
        left(90)
        forward(l)
        left(90)
        
pythagoras(100)
