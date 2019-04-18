from turtle import *

left(90)
def quadratspirale(l):
    if(l>10):
        forward(l)
        right(45)
        quadratspirale(l*0.9)
        left(135)
        forward(l)
        left(90)
        forward(l)
        left(90)
        forward(l)
        left(90)

quadratspirale(300)
