import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public int getCodeThroughStrings(String input1){

// Read only region end

// Write code here...

String ar[]=input1.split(" ");

int tot=0,len=0;

for(int i=0;i<ar.length;i++){

len+=ar[i].length();

}

int sum=0;

while(len>10){

tot=len;

sum=0;

while(tot>0){

sum+=tot%10;

tot/=10;

}

len=sum;

}

return len;

}
