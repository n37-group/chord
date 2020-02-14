# String and Chords
The goal of this theory (and optionnaly libary) is to extend the notion of String to something new the Chords

Basically a string is a list of characters.
A chord is a list of characters or variables.

The notation for a variable is just {{X}}.
So a chord looks like 'hello {{X}} world'.

Chords have a new method, an operator that unifies two chords. For example unifying 'boys and girls' and 'boys {{X}} girls'
has an obvious solution, X = 'and'.

## Algorithm
The algorithm consist in trying to unify the head of the first list with head the second.

At each step we have two lists, l1 and l2 that we're trying to unify.

Let's say that l1 = H1|Tail1 and l2 = H2|Tail2

The unification of two lists is made by the function unify(l1, l2).
The following algorithm describes this function.
By the way, unifying is commutative and associative, I guess. Maybe more, dunno yet.

The first four rules deal with at least an empty string one one side.
Btw, it's enough to test the equality of two strings.

### Rule 1: The empty string
If l1 = l2 = '' then the unification terminates and succeeds.

### Rule 2: H1 and H2 are two characters
If H1 == H2 then the unification succeeds if unify(Tail1, Tail2) succeeds.
If H1 != H2 then the unification fails

### Rule 3: l1 is not empty and l2 is empty.
If H1 is an atom the unification fails.
If H1 is a variable V, the unification succeeds if V can unify with ''

### Rule 4: l1 is empty and l2 is not empty.
Since unification is commutative, the result is unify(l2, l1) that is apply the third rule.

## Examples
### Unifying 'hello' and 'hello'

Step | Unify | Rule | Substitution 
------------ | ------------- | ------------- | -------------
1 | 'hello' = 'hello'| 2 | 
2 | 'ello' = 'ello'| 2 | 
3 | 'llo' = 'llo'| 2 | 
4 | 'lo' = 'lo'| 2 |
5 | 'l' = 'l'| 2 | 
6 | '' = '' | 1 | yes 

### Unifying 'a' and 'ab'

Step | Unify | Rule | Substitution 
------------ | ------------- | ------------- | -------------
1 | 'a' = 'ab'| 2 | 
2 | '' = 'b'| 4 | 
3 | 'b' = ''| 3 | fucked

