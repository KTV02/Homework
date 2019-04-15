from random import *

def leseDatei():
    datei = open('questions.txt', 'r')
    text = datei.read()
    datei.close()
    return text



def zufaelligeAufgabe():
    rand = randint(1, 15)

def frageStellen(combined):
    processed=[]
    processed=combined.split("!")
    print(processed[0])
    print(processed[1],processed[2],processed[3],processed[4])
    if processed[5]==input():
        return True
    else:
        return False


def quizStarten():
    print("Welche Spieler sollen mit spielen?")
    spieler = []
    questions=[]
    verloren=False
    eingabe = "  "
    beantwortet=False
    while not eingabe=="":
        eingabe = input()
        if not eingabe=="":
            spieler.append(eingabe)
    spielerCounter=0
    spielerKonto = [500 for i in range(len(spieler))]
    questions=leseDatei().splitlines()
    while verloren==False:
            print("Kontostände: ")
            for x in range(len(spieler)):
                print(spieler[x]," : ",spielerKonto[x])
            if spielerCounter<len(spieler):
                rand = randint(0, len(questions))
                print(spieler[spielerCounter], "du bist dran")
                beantwortet=frageStellen(questions[rand])
                if beantwortet==True and not spielerKonto[spielerCounter]==1024000:
                        print("Das hast du ganz toll gemacht")
                        spielerKonto[spielerCounter]*=2
                elif beantwortet==False:
                        print("Das ist leider falsch ",spieler[spielerCounter]," scheidet aus")
                        spielerKonto[spielerCounter]=500
                        spieler.pop(spielerCounter)
                        spielerKonto.pop(spielerCounter)
                        spielerCounter-=1
                elif [spielerCounter]==1024000:
                        print("Herzlichen Glückwunsch ",spieler[spielerCounter]," Du hast Wer wird 1024000 gewonnen")
                        exit(0)
                else:
                    print("Alle haben Verloren -Die Welt liegt in Trümmern")
                    verloren=False
                    exit(0)
            else:
                spielerCounter=-1
            spielerCounter+=1
   
        
