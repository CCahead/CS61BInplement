很显然，我们可以使用List<Set<Integer>>的方式来实现
对于Constructor and Connect IsConnect 的复杂度均为O(N)级别！
但是我们希望用一些更加有趣的方式来实现它！
QuickFindDS:use an array to implement Sets!
i.e:int [] id;
{0,1,2,4} {3,5} {6}
id :4 4 4 5 4 5 6 ->connect{3,5} {6}
loc:0 1 2 3 4 5 6 ->

id :4 4 4 5 4 5 5 ->{0,1,2,4} {3,5,6}
loc:0 1 2 3 4 5 6 ->IsConnect~O(1)!

However it's really hard for QuickSet to connect each Set
How to Union them with a quick way?Only Change one item to achieve that?
Using a shape of tree to store them!
So the structure will like this:
parent:-1 0 1-1 0 3-1 
loc:    0 1 2 3 4 5 6  
-1:means i'am the root the tree!(or I'm the ancesstor of the set!)
and the data stored in the loc is the parents of the loc;
If we want to connect (5,2)->We need to find the root(5) and the root(2) Set root(5) equals to root(2)!
parent:-1 0 1 0! 0 3-1 
loc:    0 1 2 3  4 5 6  
But if the tree too tall, finding the root will be complicated!


WeightQuickUnion

HeightQuickUnion