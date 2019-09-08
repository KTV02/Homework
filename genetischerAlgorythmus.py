
## Rucksackproblem

gegenstaende = [(3.5, 375), (2.5, 300), (2.0, 100), (3.0, 225), (1.0, 50),
                (1.75, 125), (0.75, 75), (3.0, 275), (2.5, 150), (2.25, 50)]
grenzgewichtRucksack = 15.0

# Funktionen zur Erzeugung einer Lösung

anzahlIndividuen = 50
mutationswahrscheinlichkeit = 0.05
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
        if gegenstaende[i]=="1":
            wert+=gegenstaende[i][1]
    if gesamtGreznAttribut(individuum)>grenzwert:
        differenz=gesamtGreznAttribut(individuum)-grenzwert
        wert-=100*2**(differenz-1)        
    return wert

def gesamtGrenzAttribut(individuum):
    wert=0
    for i in range(len(individuum)):
        if gegenstaende[i] =="1":
            wert+=gegenstaende[i][0]
    return wert
    

def kreuzung(individuum1, individuum2):
    # ...
    return (neuesIndividuum1, neuesIndividuum2)

def mutation(individuum):
    # ...
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
