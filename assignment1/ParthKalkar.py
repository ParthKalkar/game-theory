# Parth Kalkar, 05.06.2000
import enum
import numpy as np
import random
import sys
YEAR = 2000
MONTH = 6
DAY = 5

class modes(enum.Enum):
    Smart = 0
    Random = 1
    Advisor = 2

class Bot:
    def __init__(self,x):
        self.winning = np.random.choice([False], size=YEAR + MONTH + DAY + 3)   #creating and making all the values false
        self.mode=x
        self.backward_induction(YEAR + MONTH + DAY)# compute the winning array.
    
    def backward_induction(self,moves):
        if(not(moves)) :
            return YEAR + MONTH + DAY
        calculated_boundary = self.backward_induction(moves - 1)
        ans = 1
        i = calculated_boundary - 1
        while(i >= calculated_boundary - (MONTH + DAY)):
            if(i < 1):
                break
            j = i + 1
            while(j <= i + (MONTH + DAY)):
                if(not(self.winning[j])):                        
                    self.winning[i] = True
                    break                                    
                j+=1
            ans = i                                            
            i-=1
        return ans

    def get_move(self,position):        
        if((self.mode) == modes.Random.value or not(self.winning[position])):
            temp = random.randint(0, min(DAY + MONTH + 1, ((YEAR + MONTH + DAY) - position) + 1))
            if(not(temp)):  # the previous line can produce a zero and a zero is not an acceptable move, so we fix it
                temp+=1
            return position + temp
        else:
            j = position + 1
            while(j <= min(YEAR + MONTH + DAY, position + MONTH + DAY)):
                if(not(self.winning[j])):
                    return j
                j+=1
    
    def advisor(self,position):
        if((self.mode) == modes.Advisor.value):
            j = position + 1
            while(j <= min(YEAR + MONTH + DAY, position + MONTH + DAY)):
                if(not(self.winning[j])):
                    print("You having a winning strategy if you move to ")
                    print(j)
                    return
                j+=1
            print("Unfortunately, you don't have a winning strategy")
            
def get_num():
        input_a = int(input())
        return input_a            

sys.setrecursionlimit(2500)       
print("Starting the game. While entering your move, if you input -1 then the game will restart, if you input -10 then the game will shutdown.")
while(True):
    # setting up the starting position in case the user wants a random position        
    starting_position = random.randint(1,(YEAR + MONTH + DAY))
    # taking input from the user about the starting positio        
    print("Enter 1 to start at a random position or 2 to specify the starting position")  
    while(True):
        temp = get_num()
        if(temp == -100): 
            continue
        if (temp == 1 or temp == 2): 
            break
        else: 
            print("Wrong input, try again!")
    # getting the starting position from user        
    if(temp == 2):
        print("Enter starting position: ")
        while(True):
            starting_position = get_num()
            if(starting_position == -100): 
                continue
            if(starting_position >= 1 and starting_position < YEAR + MONTH + DAY): 
                break
            else: 
                print("Wrong input, try again!")
    # taking input for setting up the bot        
    print("Enter 1 for smart mode, 2 for random mode, and 3 for advisor mode.")

    while(True): 
        temp = get_num()
        if(temp == -100): 
            continue
        if (temp == 1 or temp == 2 or temp == 3): 
            break
        else: 
            print("Wrong input, try again!")
    # setting up the bot, and array for logging moves        
    bot = Bot(temp-1)
    log = [0] * int(YEAR + MONTH + DAY + 10)
    log[0] = starting_position
    idx = 1
    # game phase
    while(True):
        print("Current position is: ")
        print(starting_position)
        bot.advisor(starting_position)
        
        while(True):
            print("Enter your move: ")
            move = get_num()
            if(move == -100): 
                continue
            if(move == -1): 
                break
            if(move == -10): 
                exit()
            if(move - starting_position <= MONTH + DAY and move <= YEAR + MONTH + DAY and move > starting_position):
                starting_position = move
                log[idx] = starting_position
                idx+=1
                break
            else:
                print("Wrong input, try again!")
        if(move == -1): 
            break
        if(starting_position == YEAR + MONTH + DAY):
            print("You won!")
            break
        starting_position = bot.get_move(starting_position)
        print("Spoiler moved to ")
        print(starting_position)
        log[idx] = starting_position
        idx+=1
        if(starting_position == YEAR + MONTH + DAY):
            print("Spoiler won!")
            break
    # making the log file
    f = open("log.txt", "w")
    f.write("This game's starting position is: " + str(log[0]) + '\n')
    i=1
    while(i<idx):
        if(not(i%2)):
            f.write("Spoiler played: " + str(log[i]) + '\n')
        else:
            f.write("Duplicator played: " + str(log[i]) + '\n')
        i+=1
        
    f.close()