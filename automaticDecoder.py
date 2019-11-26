from serial import *
import time

def decode(interface, bitzeit):
    s = interface
    byte = ""
    security = ""
    while True:
        if s.getCTS() == False:
            time.sleep(bitzeit/10)
        else:
            time.sleep(bitzeit*1.5)    
            for i in range(12):
                outcome = s.getCTS()
                if i<8:                  
                    if outcome == False:
                        byte += "0"
                        time.sleep(bitzeit)
                    elif outcome == True:
                        byte += "1"
                        time.sleep(bitzeit)
                if i>=8 and i<12:
                    if outcome == False:
                        security += "0"
                        time.sleep(bitzeit)
                    elif outcome == True:
                        security += "1"
                        time.sleep(bitzeit)
            if crc(byte) == security:
                print("Byte is ok")
                print(byte)
                print(toString(byte))
            else:
                print("Error, byte is not ok")
            byte=""
            security=""
            

def toString(codierung):
    letter = chr(int(codierung, 2))
    return letter
    
def crc(bitfolge, polynom = '10011'):
    """
    zu der 'nachricht' und zu dem 'polynom' (Strings aus 0 und 1) wird
    die CRC-'PrÃ¼fsumme' berechnet (String aus 0 und 1)
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

            
interface = Serial("com4")
decode(interface, 1)
