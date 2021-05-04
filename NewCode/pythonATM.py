import decimal

from decimal import Decimal



print("*******************")

print("This program will take in a monetary amount you provide",
      "and break it up into bills and coins using the least amount")

print("*******************")

#print("\u20AC")

# in trying to be more optimal
# it does loose out on the specificity of the original code



def getChange(value):
    
    dollarDenominations = [Decimal("100"), Decimal("50"), Decimal("20"), Decimal("10"),
                           Decimal("5"), Decimal("1")]
    
    coinDenominations = [Decimal("0.25"), Decimal("0.10"), Decimal("0.05"),
                         Decimal("0.01")]
    
    # could maybe use a dictionary for the coins
    # so we can use the names of the coins like
    # dimes and quarters
    
    print("*******************")

    print(f"The amount you entered was:   {value:.2f}")
    
    
    dollars = Decimal(value // 1)

    cents = Decimal(value % 1)
    
    # could maybe combine with coins
    
    
    for bill in dollarDenominations:
        
        
        numBills = dollars // bill
        
        dollars = dollars % bill
        
        if (numBills != 0):
            print("The number of", bill, "dollar bills you get is :", numBills)
            
        if (dollars == 0):
            break
        
        
    for coin in coinDenominations:
        
        
        numCoins = cents // coin
        
        cents = cents % coin
        
        if (numCoins != 0):
            print("The number of", coin, "coins you get is :", numCoins)
            
        if (cents == 0):
            break
        
        
        
    print("*******************")
        
        

    






    
     
     
print("Would you like to enter a value?")
    
ask = input("Enter Y for yes and anything else for no:   ")
    
while(ask == "Y"):


    val = Decimal(input("Enter an amount in dollars without the dollar sign:   "))
    
    # could have a check for what is entered

    getChange(val)
    
    print("Would you like to enter a value?")
    
    ask = input("Enter Y for yes and anything else for no:   ")
    


# output


"""
*******************
This program will take in a monetary amount you provide and break it
up into bills and coins using the least amount
*******************
Would you like to enter a value?
Enter Y for yes and anything else for no:   Y
Enter an amount in dollars without the dollar sign:   9.87
*******************
The amount you entered was:   9.87
The number of 5 dollar bills you get is : 1
The number of 1 dollar bills you get is : 4
The number of 0.25 coins you get is : 3
The number of 0.10 coins you get is : 1
The number of 0.01 coins you get is : 2
*******************
Would you like to enter a value?
Enter Y for yes and anything else for no:   no


"""