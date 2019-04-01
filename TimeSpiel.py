from time import *
from random import *
version= int(input("Welche version wollen sie spielen? Schreiben sie 1 oder 2. \n"))
spieler1=0
spieler2=0
rv2=0;
def game():
    print("Rate Zeit Spiel \n")
    soll=randint(1,20)
    print("Rate wann ",soll," Sekunden um sind: LOOOS \n")
    start=time()
    input(str("druecke enter \n"))
    end=time()
    vergangen=end-start
    diff=vergangen-soll
    print("Es sind ",vergangen," Sekunden vergangen, das heißt du warst um ",diff," Sekunden daneben \n")
    return diff

def auswertung():
    if spieler1 < spieler2:
        print("Spieler 1 hat gewonnen. Glückwunsch! \n")
    elif spieler1 > spieler2:
        print("Spieler 2 hat gewonnen. Glückwunsch! \n")
    else:
        print("WAS IST DENN HIER LOS?! \n")
if version==1:
    print("V1 \n")
    runden=int(input("Wie viele Runden möchtet ihr zwei spielen \n"))
    for x in range(runden*2):
        if x%2==0:
            print("Spieler 1 ist an der Reihe \n")
            spieler1+=abs(game())
        elif x%2==1:
            print("Spieler 2 ist an der Reihe \n")
            spieler2+=abs(game())
    print("Spieler 1 lag ",spieler1," Sekunden daneben, Spieler 2 lag ",spieler2," Sekunden daneben \n")
    auswertung()
if version==2:
    print("V2 \n")
    while(spieler1 < 30 and spieler2 < 30):
        if rv2%2==0:
            print("Spieler 1 ist an der Reihe \n")
            spieler1+=abs(game())
        elif rv2%2==1:
            print("Spieler 2 ist an der Reihe \n")
            spieler2+=abs(game())
        rv2+=1   
    print("Spieler 1 lag ",spieler1," Sekunden daneben, Spieler 2 lag ",spieler2," Sekunden daneben \n")
    auswertung()


 








