class My{
 public static void main(String[] args){
  System.out.println("Hello "+args[0]);
  long start = System.currentTimeMillis();
  double d = 0;
  for(long i = 0; i < 100000000; i++) d+= i;
  System.out.println("d="+d);
  System.out.println("Time="+(System.currentTimeMillis()-start));
}
}