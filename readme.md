## Bowling Score Card

### Score a game of bowling 

Rules (http://www.bowling2u.com/trivia/game/scoring.asp)

#### Basic Score Keeping
In score keeping a game of bowling each set of ten pins is called a frame and an entire game has ten frames. The object of each frame in bowling is to knock over all ten pins, and the object of the game is to have a high score.

#### Bonus Scoring
When a bowler accomplishes the the goal of each frame by knocking over all ten pins they are awarded a bonus. This bonus that is awarded will depend on whether they knocked all ten pins down on their first ball roll or the second roll.

#### The Strike
When a bowler knocks all ten pins down on the first ball roll they are said to have rolled a strike. The score keeper will mark an X for that frame and the bowlers score is the ten pins that they just knocked down plus they get to add to that what they knock down on their next two ball rolls. Consequently, you may not know what a bowlers score is on that frame for up to two more frames!

#### The Spare
When a bowler knocks all ten pins down on the second ball roll they are said to have rolled a spare. The score keeper will mark a / for that frame and the bowlers score is the ten pins that they just knocked down plus they get to add to that what they knock down on their next ball roll. Consequently, you will not know what the bowers score is until the next frame!

(http://rubyquiz.strd6.com/quizzes/181-bowling-scores)

Input:
`calculate_score John 6 2 7 1 10 9 0 8 2 10 10 3 5 7 2 5 5 8`

Output:
```
John's final score: 140

Frame     Roll  Roll    Score
   1        6     2        8
   2        7     1       16
   3        X             35
   4        9     -       44
   5        8     /       64
   6        X             87
   7        X            105
   8        3     5      113
   9        7     2      122
  10        5     /      140
   *        8
```