
## Rucksackproblem

gegenstaende = [(3.5, 375), (2.5, 300), (2.0, 100), (3.0, 225), (1.0, 50),
                (1.75, 125), (0.75, 75), (3.0, 275), (2.5, 150), (2.25, 50)]
grenzgewichtRucksack = 15.0

# Funktionen zur Erzeugung einer Lösung

anzahlIndividuen = 50
mutationswahrscheinlichkeit = 0.4
grenzwert=grenzgewichtRucksack
anzahlEigenschaften=10
import random

def erzeugeIndividuum():
    individuum=""
    for i in range(anzahlEigenschaften):
        individuum+=str(random.randint(0,1))
        
    return individuum

def erzeugePopulation():
    population=[]
    for i in range(anzahlIndividuen):
        population.append(erzeugeIndividuum())
    return population
        
def fitness(individuum):
    wert=0
    for i in range(len(individuum)):
        if individuum[i]=="1":
            wert+=gegenstaende[i][1]
    if gesamtGrenzAttribut(individuum)>grenzwert:
        differenz=gesamtGrenzAttribut(individuum)-grenzwert
        wert-=100*2**(differenz-1)        
    return wert

def gesamtGrenzAttribut(individuum):
    wert=0
    for i in range(len(individuum)):
        if individuum[i] =="1":
            wert+=gegenstaende[i][0]
    return wert
    

def kreuzung(individuum1, individuum2):
    neuesIndividuum1 = ""
    neuesIndividuum2 = ""
    for i in range(anzahlEigenschaften):
        rand = random.randint(0,1)
        if rand == 0:
           neuesIndividuum1 += individuum1[i]
           neuesIndividuum2 += individuum2[i]
        else:
           neuesIndividuum1 += individuum2[i]
           neuesIndividuum2 += individuum1[i] 
    return (neuesIndividuum1, neuesIndividuum2)

def mutation(individuum):
    if random.randint(1,10)==mutationswarscheinlichkeit:
        pass
    return individuum

def selektionElternteil(population):
    # ...
    return elternteil

def naechstePopulation(population):
    # ...
    return neuePopulation

def maxFitness(population):
    # ...
    return (maxIndividuum, maximumFitness)

def loesungGenetischerAlgorithmus():
    # ...
    pass
    #return loesung

# Test
#for i in range(20):
 #   print(loesungGenetischerAlgorithmus())
