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
            byte=""
            security=""
            daten = ""
            empfänger = ""
            sender = ""
            crcGesamt = ""
            for i in range(20):
                if(s.getCTS()):
                    daten += '1'
                else:
                    daten += '0'
                time.sleep(bitzeit)
            empfänger = daten[:4]
            sender = daten[4:8]
            byte = daten[8:16]
            crcGesamt = empfänger[:] + sender[:] + byte[:]
            security = daten[16:]
            if empfänger == kennung: 
                print(byte)
                print(toString(byte))
                print(security)
                print(sender)
                if crc(crcGesamt) == security:
                    print("Byte is ok")
                else:
                    print("Error, byte is not ok")

            

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

            
interface = Serial("com5")
kennung = "0001"
interface.setRTS(0)
decode(interface, 1)
