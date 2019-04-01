print("Willkommen zum BMI Rechner")
gewicht=(float(input("Bitte geben sie ihr Gewicht in kg ein")))
groesse=(float(input("Bitte geben sie ihre Koerpergroesse in m ein")))
bmi=gewicht/(groesse*groesse)
print("Dein bmi ist"+bmi)
if bmi>=30:
         print("Sie sind adipös")
elif 25 < bmi < 30:
         print("Essen Sie weniger")
elif 20<bmi<=25:
         print("Sie sind perfekt <3")
elif bmi<=20:
         print("Sie sind zu dünn, gönnen Sie sich etwas")
         

