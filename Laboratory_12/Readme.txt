
COMMAND
1. The game client must perform tasks in the background without interfering with the development of the game (without blocking or slowing it down)
   - customer data backup
   - receive updates for the forum
   - update 3D models in silent mode (during the game)
   - a solution must be found through which these tasks can be executed without affecting the execution of the game
   These routines can be executed  in any order during the gameplay


    STATE -> obiect care isi genereaza starile
2. Game characters ->actions are affected by their state<- indiciu necesar : STAREA obiectului este colectia de valori
   - the gameplay is different
   - the action effects are different
   - the way the superhero moves is affected by its state (lifepoints)

   STRATEGY -> obiectului i se spune ce sa faca
3.  Players can pay their monthly subscription in different ways (paypal, bank card, crypto).
The payment is done automatically each month based on the user preferences.
Find a way to implement the payment action based on user settings without asking the player each month.
Take into account that new payments methods could be introduced in the future.


    CHAIN -> o cascada de conditii
4. We have different rules that are applied when a character gets a hit
   - if the character has a shield then the hit loses 1/2 points
   - if the character has a power spell then the hit loses another 1/2 points
   - if the character has less than 1/4 of life points then it changes the state to critical wounded
   - if the character has 0 or negative points after the hit is game over
   - if ....
   - new effects will be added in the future based on new game additions


   OBSERVER -> niste entitati reactioneaza fara sa se derabjeze reciproc
5. During the game the client may lose the connection to the server (for various reasons). When this happens,the different modules in the game must react accordingly
 - the game instance must be saved on the client
 - character attributes must be saved
 - the gamer must be notified
 - the connection must be retried


    MEMENTO
6.

