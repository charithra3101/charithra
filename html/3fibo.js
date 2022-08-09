function fib(){
    n=prompt("Enter a umber ");
    f1=0;
    f2=1;
    document.write("Fibonocci series upto" +n+ " is:<br/>");
    document.write(f1 + "<br/>" + f2  + " <br/ >");
     for( i=3;i<=n;i++){
      f3=f1+f2;
      f1=f2;
      f2=f3;
      document.write(f3 + "<br />");
     }
 }