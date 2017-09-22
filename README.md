# ThreadsExamPrep1

More threads can do multiple task at the same time, so splitting a workload up into smaller workloads and splitting them to more proccesses to do them is faster then one proccess working through the whole workflow.

Also when introducing a, ui threads are nessescary to not become stuck. Since the program can either do ui or background work.

Race conditions happens when multiple threads tries to acces a non atomic method. Atomic means that a method cannot be split into multiple jobs. So when multiple  threads access a non atomic method they interfere with eachother.
By using synchronization we make a method atomic. Only one thread can use the method at the time. Using a lock can be used as well.


