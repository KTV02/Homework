from random import *

def leseDatei():
    datei = open('questions.txt', 'r')
    text = datei.read()
    datei.close()
    return text

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

    #loops the questions
    while verloren==False:
         #checks if spieler counter greater than number of players
            if spielerCounter<len(spieler):
                 #prints balance of every player
                print("Kontostände: ")
                for x in range(len(spieler)):
                    print(spieler[x]," : ",spielerKonto[x])  
                rand = randint(0, len(questions)-1)
                print(spieler[spielerCounter], "du bist dran")
                #asks question
                beantwortet=frageStellen(questions[rand])
                  #if answer correct and player not millionaire
                if beantwortet==True and not spielerKonto[spielerCounter]==1024000:
                       print("Das hast du ganz toll gemacht")
                       spielerKonto[spielerCounter]*=2
                   #if answer incorrect
                elif beantwortet==False:
                        print("Das ist leider falsch ",spieler[spielerCounter]," scheidet aus")
                        spielerKonto[spielerCounter]=500
                        spieler.pop(spielerCounter)
                        spielerKonto.pop(spielerCounter)
                        spielerCounter-=1
                            
                    #if player millionaire
                elif spielerKonto[spielerCounter]==1024000:
                    print("Herzlichen Glückwunsch ",spieler[spielerCounter]," Du hast Wer wird 1024000 gewonnen")
                    exit(0)
            #all players lost       
            elif len(spieler)==0:
               print("Alle haben Verloren -Die Welt liegt in Trümmern")
               verloren=True
               exit(0)
            #resets spieler counter
            else:
                spielerCounter=-1
                
            spielerCounter+=1
   
        
