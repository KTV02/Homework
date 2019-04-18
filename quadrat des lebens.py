from turtle import *

left(90)

def quadrat(leng):
    if leng>10:
        left(90)
        forward(leng/2)
        right(90)
        forward(leng)
        left(45)
        quadrat(leng/2)
        right(135)
        forward(leng)
        left(45)
        quadrat(leng/2)
        right(135)
        forward(leng)
        right(90)
        forward(leng/2)
        right(90)
       
quadrat(150)
        
        
