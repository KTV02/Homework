


def eingabeFunktion(nachricht):
    liste = []
    print(nachricht)
    eingabe = "  "
    while not eingabe=="":
        eingabe = input()
        liste.append(eingabe)
        #spieler= spieler + [eingabe]
    return liste

def loescheFenster():
    for x in range(50):
        print("")
    
def spielen():
    koffer = []
    spieler = []
    spielerCounter = 0
    spieler = eingabeFunktion("Gebe hier die Spielernamen ein")
        if spielerCounter<=len(spieler):
            print(spieler[spielerCounter], "Was möchtest du in deinen Koffer packen?")
            eingabeFunktion("")
        else:
            spielerCounter = 0
            print(spieler[spielerCounter], "Was möchtest du in deinen Koffer packen?")
            eingabeFunktion("")
    koffer = pruefen(koffer,eingabeFunktion(""),spieler[spielerCounter])
    spielerCounter+=1
    

def pruefen(alteListe, neueListe, player):
    counter = 0
    for x in neueListe:
        if not counter>len(alteListe): 
            if alteListe[counter]==x:
                counter+=1
            else:
                print(player, ", du hast leider verloren")
        else:
            return neueListe
