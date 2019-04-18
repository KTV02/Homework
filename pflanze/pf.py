from turtle import *

left(90)

def quadrat(leng):
  if leng>5:
        left(90)
        forward(leng/2)
        right(90)
        forward(leng/2)
        left(90)
        quadrat(leng/3)
        right(90)
        forward(leng/2)
        right(90)
        forward(leng/2)
        left(90)
        quadrat(leng/3)
        right(90)
        forward(leng/2)
        right(90)
        forward(leng/2)
        left(90)
        quadrat(leng/3)
        right(90)
        forward(leng/2)
        right(90)
        forward(leng/2)
        right(90)

      

quadrat(100)
