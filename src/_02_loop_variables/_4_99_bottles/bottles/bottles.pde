for(int i=99; i>0;i--){
if (i==2)  { 
  System.out.println ("2 bottles of beer on the wall\n"
+ "2 bottles of beer!\n"
+ "take one down, pass it around,\n"
+ "1 bottle of beer on the wall!\n"); }
if (i==1) {
  System.out.println ("1 bottle of beer on the wall\n"
+ "1 bottle of beer!\n"
+ "take it down, pass it around,\n"
+ "0 bottles of beer on the wall!\n");
}else{ System.out.println(i + " bottles of beer on the wall\n"
+ i + " bottles of beer!\n"
+ "Take one down, pass it around,\n"
 + (i-1) + " bottles of beer on the wall!\n");
}
}

System.out.println("No bottles of beer on the wall!\n"
+ "No bottles of beer!\n"
+ "Go to the store and buy some more\n"
+ "99 bottles of beer on the wall!\n");
