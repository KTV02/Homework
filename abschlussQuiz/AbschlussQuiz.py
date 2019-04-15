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
    print(processed)
    if processed[5]==input():
        return true
    else:
        return false
    

    


def quizStarten():
    print("Welche Spieler sollen mit spielen?")
    spieler = []
    questions=[]
    eingabe = "  "
    while not eingabe=="":
        eingabe = input()
        if not eingabe=="":
            spieler.append(eingabe)
    questions=leseDatei().splitlines()
    print(questions)
