import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public int sumOfSumsOfDigits(int input1){

// Read only region end

// Write code here...

int last=0,current=0,r=0,sum=0;

while(input1>0){

r=input1%10;

current=r+last;

input1/=10;

sum=sum+current;

last=last+r;

}

return sum;

}
