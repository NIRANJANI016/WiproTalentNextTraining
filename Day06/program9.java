import java.io.*;

import java.util.*;
// Read only region start

class UserMainCode

{

public String identifyPossibleWords(String input1,String input2){

// Read only region end

// Write code here...

String[] ar=input2.split(":");

String temp="",fin="";

int count=0;

for(int i=0;i<ar.length;i++){

temp=ar[i];

count=0;

if(temp.length()==input1.length()){

for(int j=0;j<temp.length();j++){

if(input1.charAt(j)!='_'){

if(Character.toUpperCase(input1.charAt(j))==Character.toUpperCase(temp.charAt(j))){

count++;

}

}

}

if(count==temp.length()-1) fin=fin+temp.toUpperCase()+":";

}

if(fin=="") return "ERROR-009"; return fin.substring(0,fin.length()-1);

}

}
