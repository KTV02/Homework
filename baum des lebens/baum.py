from turtle import *

left(90)
def baum(leng):
    if leng>5:
        forward(leng)
        left(45)
        baum(leng/2)
        pencolor("red")
        right(90)
        baum(leng/2)
        right(135)
        forward(leng)
        right(180)


baum(100)
        


    
