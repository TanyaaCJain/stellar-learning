# Graphics.h

It is a header file for C and C++ programs to add graphics via the TURBOC compiler.
The functions written in this header file can be explored [here](https://web.stanford.edu/class/archive/cs/cs106b/cs106b.1126/materials/cppdoc/graphics.html).

However, problem arises in attempt to display graphics using graphics.h header file in Ubuntu.
This is because of the graphics.h header file is not supported by g++ compiler.

To accomplish this, one must run the following commands in shell.

1. To download the required packages and library files.

```bash
cat packages.txt | xargs sudo apt-get install
```
OR
```bash
xargs -a packages.txt sudo apt-get install
```

>> xargs reads items from the standard input and executes the command as many times as the items, delimited by blanks (which can be protected with double or single quotes or a backslash) or newlines.

2. Download [libgraph-1.0.1.tar.gz](http://download.savannah.nongnu.org/releases/libgraph/libgraph-1.0.1.tar.gz)
or the suitable version from [here](http://download.savannah.nongnu.org/releases/libgraph/)

3. Extract libgraph-1.0.1.tar.gz into your Home folder
```bash
tar xf ~/libgraph-1.0.1.tar.gz
```

4. Navigate into the folder
```bash
$ cd libgraph-1.0.1
```

5. Run the following commands in shell. The next command is worth executing only and only if the previous 
commands successfully executes.
```bash
$ ./configure
$ sudo make
$ sudo make install
```

Now, when writing the graphics code in C or C++, initialize graphics files in Ubuntu as:
```bash
int gd,gm=VGAMAX; gd=DETECT;
initgraph(&gd,&gm,NULL);
``` 
In Windows, NULL is replaced by path/to/the/BGI file which is usually written as:
```bash
int gd,gm=VGAMAX; gd=DETECT;
initgraph(&gd,&gm,"C://TC/BIN/BGI");
``` 

Now to compile the code with gcc compiler and then run it, execute the following commands in shell.
We are taking example of smile.c graphics file
```bash
$ gcc smile.c -o smle -lgraph
$ ./smile
```

