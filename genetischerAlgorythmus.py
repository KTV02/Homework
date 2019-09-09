
## Rucksackproblem

gegenstaende = [(3.5, 375), (2.5, 300), (2.0, 100), (3.0, 225), (1.0, 50),
                (1.75, 125), (0.75, 75), (3.0, 275), (2.5, 150), (2.25, 50)]
grenzgewichtRucksack = 15.0

# Funktionen zur Erzeugung einer Lösung

anzahlIndividuen = 50
mutationswahrscheinlichkeit = 4
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
        wert-=120*2**(differenz-1)        
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
    return (mutation(neuesIndividuum1),mutation(neuesIndividuum2))

def mutation(individuum):
    if random.randint(1,10)<=mutationswahrscheinlichkeit:
        randindex=random.randint(0,9)
        if individuum[randindex]=="0":
            individuum=individuum[:randindex]+"1"+individuum[randindex+1:]
        else:
            individuum=individuum[:randindex]+"0"+individuum[randindex+1:]
    return individuum

def selektionElternteile(population):
    eltern=[]
    sortiert=sort(population)
    eltern+=sortiert[(anzahlIndividuen-anzahlIndividuen//5):]
    return eltern

def sort(population):
   less = []
   greater = []
   p=population[:]
   if len(p) > 1:
       pivot = p[0]
       for x in p[1:]:
           if fitness(x) < fitness(pivot):
              less.append(x)
           else:
               greater.append(x)
       return sort(less)+[pivot]+sort(greater)
   else:
       return p
    
def naechstePopulation(population):
    eltern=selektionElternteile(population)
    neuePopulation=[]
    for x in eltern[:anzahlIndividuen//10]:
        for i in eltern:
            neuePopulation+=kreuzung(x,i)
            random.shuffle(neuePopulation) #This method changes the original list/tuple/string, it does not return a new list
    return neuePopulation[:anzahlIndividuen]

def maxFitness(population):
    maxIndividuum=sort(population)[len(population)-1]
    return (maxIndividuum,fitness(maxIndividuum))

def loesungGenetischerAlgorithmus(generationen):
    loesung=naechstePopulation(erzeugePopulation())
    for i in range(generationen):
        loesung=naechstePopulation(loesung)
    return maxFitness(loesung)

# Test
for i in range(20):
    print(loesungGenetischerAlgorithmus(20))




    
            
