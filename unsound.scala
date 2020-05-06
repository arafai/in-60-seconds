import scala.collection.mutable.{Map => MMap, Set => MSet}

val ms:MMap[Int, MSet[Int]] = MMap.empty

if(!ms.contains(1)) ms += 1 -> MSet(1) else ms(1) += 1

res3: scala.collection.mutable.Iterable[_ >: (Int, scala.collection.mutable.Set[Int]) with Int] 
with scala.collection.mutable.Builder[(Int, scala.collection.mutable.Set[Int])
with Int,scala.collection.mutable.Iterable[_ >: (Int, scala.collection.mutable.Set[Int]) 
with Int] with scala.collection.mutable.Builder[(Int, scala.collection.mutable.Set[Int]) 
with Int,scala.collection.mutable.Iterable[_ >: (Int, scala.collection.mutable.Set[Int]) 
with Int] with scala.collection.mutable.Builder[(Int, scala.collection.mutable.Set[Int]) 
with Int,scala.collection.mutable.Iterable[_ >: (Int, scala.collection.mutable.Set[Int])
with Int] with scala.collection.mutable.Builder[(Int, scala.collection.mutable.Set[Int]) 
with Int,scala.collection.mutable.Clearable with scala.collection.mutable.Shrinkable[Int...
