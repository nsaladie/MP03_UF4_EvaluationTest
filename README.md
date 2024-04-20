# Evaluation Test

The "League_of_Superheroes" wants to keep track of all current members of its team. 

## SuperHero class (3 points)
Code the class "SuperHero" with the following attributes: name, age, and powers. This last attribute must be an array that allows us to store up to 4 powers per superhero. Set up a constructor to initialise all attributes except powers. In addition, implement the following methods:
-  calculatePotential():
returns the superhero's potential expressed as a number. This is obtained by multiplying its age by 10.
-  showPowers(): displays the superhero's powers by console.
-  setPower(): receives a power and a position and initialises the specified superhero's power to the position it will occupy in its list of powers.

## Mutable Interface (2 points) 
Encodes the mutable interface, which can mutate, with the following methods:
-  transform()
-  restore()

## Class Main (2 points)
Create another Main class with the main method in which:
-  A superhero of type Hulk is created. Do not ask for any keyboard parameters, initialise the variables inside the constructor of the Hulk class.
-  Call the method trasform().
-  Show attributes and their potential.
-  Call the method restore();
