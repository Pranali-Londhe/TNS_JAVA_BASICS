class box<T>{
    private T item;
    void set(T item){
        this.item = item;
    }

    T get(){
        return item;
    }

}

    class quiz{
        public static void main(String [] args){
            box<String> b1= new box<>();
            b1.set("samsung");
            String s= b1.get();
            System.out.println(s);

            box<Integer> b2 = new box<>();
            b2.set(25000);
            Integer i = b2.get();
            System.out.println(i);
        }
    }

