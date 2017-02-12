# Stopwatch tasks by Patiphan Srisook (5910546422)

I ran the tasks on my Macbook Pro , and got these results

Task                                  | Time
--------------------------------------|-------:
Append 50,000 chars to String         | 1.225166 sec
Append 100,000 chars to String        | 2.669272 sec
Append 100,000 chars to StringBuilder | 0.002129 sec
Sum array of double primitives with count = 1,000,000,000 | 1.033204 sec
Sum array of Double objects with count = 1,000,000,000 | 5.081883 sec
Sum array of BigDecimal with count = 1,000,000,000 | 8.811566 sec


## Explanation of Results

# Appending chars to String
From this tasks when I tried to add double of number of chars and added to String, I saw the elapsed time was increased double. Because when we called `+=` for example `String word = "computer";` and then `word = word + "engineer";` the memory will create String `"computer"` , `"engineer"` and `"computerengineer"` ,then String `word` will point to `"computerengineer"` instead , so when we create a large size of String such as String with 50,000 chars , they will use memory to store a new String and still keep the old String until it is replaced by the new one.

# Appending chars to StringBuilder
StringBuilder has a char array inside. So adding String or char into this StringBuilder will just update the value inside the char[], and no memory is being used in this process ,so StringBuilder process faster than normal append String.

# Adding double primitive
`double` is a primitive. It does not contain any attributes or methods, so it will consume a less memory.

# Adding Double object
`Double` is an object which contain attributes and methods so it takes more memory.

# Adding BigDecimal
`BigDecimal` has a lot of attributes compare to `Double` so actually it will make program run slower.
