milkprice = 10
darkprice = 30
milkdemand = 500
darkdemand = 200
productionmax = 600
productionrange = range(400,600,50)
availableproduction = productionmax - milkdemand
milkincome = milkprice * milkdemand
darkincome = availableproduction * darkprice

# availableproduction = productionmax - milkdemand
# totincome = mp * md + dp * ap
# milk sold | milk income || dark sold | dark income | total income

print("milk choco | milk $$ || dark choco | dark $$ | total income")
# print(milkdemand, milkincome, availableproduction, darkincome, milkincome + darkincome)
for p in productionrange:
    darkinc = (productionmax - p) * darkprice
    totinc = (p * milkprice) + darkinc
    if p < 500:
        print(p, "|", p * milkprice, "|", productionmax - p, "|", darkinc, "|", totinc)
    if p >= 500:
        print(milkdemand, "|", milkincome, "|", productionmax - milkdemand, "|", darkinc, "|", totinc) 
