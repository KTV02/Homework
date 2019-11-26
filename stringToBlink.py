from serial import Serial
import time

def crc(bitfolge, polynom = '10011'):
    """
    zu der 'nachricht' und zu dem 'polynom' (Strings aus 0 und 1) wird
    die CRC-'Prüfsumme' berechnet (String aus 0 und 1)
    """
    lp = len(polynom)
    ln = len(bitfolge)
    for j in range(lp-1):
        bitfolge = bitfolge+'0'
    bitliste = list(bitfolge)
    schieberegister = bitliste[:lp]
    for i in range(ln):
        if schieberegister[0] == '1':
            for j in range(lp):
                if schieberegister[j] == polynom[j]:
                    schieberegister[j] = '0'
                else:
                    schieberegister[j] = '1'
        if i < ln-1:
            schieberegister = schieberegister[1:lp]+list(bitliste[lp+i])
    return ''.join(schieberegister[1:])

def txtToBinary(text,sleep,interface):
    converted=""
    counter=0
    modified=""
    byte=""
    for i in text:
        converted+=bin(ord(i))[2:].zfill(8)
    print(converted)
    for i in converted:
        counter+=1
        if counter<=8:
            byte+=i
        if counter==8:
            modified+=byte+crc(byte)
            print("modified",modified)
            byte=""
            counter=0
    converted=modified
    send(converted,sleep,interface)
    return converted
    
def send(code,sleep,interface):
    s= interface
    counter=0
    #code+=crc(code)
    print(code)
    for i in code:
        if counter%12==0:
            s.setRTS(0)
            time.sleep(sleep)
            print("START")
            s.setRTS(1)
            time.sleep(sleep)
            s.setRTS(0)
        if i=="1":
            s.setRTS(1)
            time.sleep(sleep)
        else:
            s.setRTS(0)
            time.sleep(sleep)
        counter+=1
    s.setRTS(0)
    time.sleep(sleep)
    
schnittstelle=Serial("com3")
txtToBinary("A",1,schnittstelle)


            


