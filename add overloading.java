import java.util.*;
class Add
{
int a, b, c, d;
void add(int x, int y) 
{        
a = x;
b = y;
c = a + b;
System.out.println(c);     
}
void addition(int x, int y, int z)
{        
a = x;
b = y;
c = z;
d = a + b + c;
System.out.println(d); 
}
  
public static void main(String[] args) 
{        
Add obj = new Add();         
obj.add(10, 20);         
obj.addition(10, 20, 30);    
}
}
