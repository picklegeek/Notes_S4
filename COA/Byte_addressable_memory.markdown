### Byte addresable memory
Here each byte has a seperate address. In a 32 bit system each word occupies 32 bit (4 bytes).Hence the word address go as 0,4,8( assuming 0 is the starting address of the first word).

#### Big Endian Byte representation
The smallest addressed bit is the Most Significant bit(Leftmost bit).

#### Little Endian Byte representation
The smallest addressed bit is the Least Significant bit(Rightmost bit).

### Word Alignment   
It means each word starts with an address which is a multiple of the number of bytes in the word.

        Memory Operations
          /      \
         /        \
        /          \
       /            \
  Load(Read)      Store(Write)