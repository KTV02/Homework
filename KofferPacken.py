
def eingabeFunktion():
    liste = []
    eingabe = "  "
    while not eingabe=="":
        eingabe = input()
        if not eingabe=="":
            liste.append(eingabe)
    return liste

def loescheFenster():
    for x in range(50):
        print("")
    
def spielen():
    koffer = []
    spieler = []
    spielerCounter = 0
    print("Gebe hier die Spielernamen ein")
    spieler = eingabeFunktion()
   
    while True:
        if spielerCounter<len(spieler):
                print(spieler[spielerCounter], "Was möchtest du in deinen Koffer packen?")
                koffer = pruefen(koffer,eingabeFunktion(),spieler[spielerCounter])
                loescheFenster()
        else:
                spielerCounter = 0
                print(spieler[spielerCounter], "Was möchtest du in deinen Koffer packen?")
                koffer = pruefen(koffer,eingabeFunktion(),spieler[spielerCounter])
                loescheFenster()
        spielerCounter+=1
        

def pruefen(alteListe, neueListe, player):
    counter = 0
    for x in neueListe:
        if not counter>=len(alteListe): 
            if alteListe[counter]==x:
                counter+=1
            else:
                print(player, ", du hast leider verloren")
                exit(0)
                
        else:
            return neueListe
