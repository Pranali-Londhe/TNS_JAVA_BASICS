class Pair<k,v>{
    private k key;
    private v value;

    Pair(k key,v value){
        this.key = key;
        this.value = value;
    }
    k getKey(){
        return key;
    }
    v getValue(){
        return value;
    }
}

class eg1{
    public static void main(String []args){
        Pair<String, Integer> p = new Pair<>("Age", 44);
        String s = p.getKey();
        Integer i = p.getValue();
        System.out.println(s);
        System.out.println(i);
    }
}