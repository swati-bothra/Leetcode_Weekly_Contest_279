class Bitset {
    int size;
    Set<Integer>[] map;

    public Bitset(int size) {
        this.size=size;
        map=new HashSet[2];
        map[0]=new HashSet<>();
        map[1]=new HashSet<>();
        for(int i=0;i<size;i++){
            map[0].add(i);
        }
    }
    
    public void fix(int idx) {
        if(map[0].contains(idx))map[0].remove(idx);
        map[1].add(idx);
    }
    
    public void unfix(int idx) {
         if(map[1].contains(idx))map[1].remove(idx);
        map[0].add(idx);
    }
    
    public void flip() {
        Set temp=map[0];
        map[0]=map[1];
        map[1]=temp;
    }
    
    public boolean all() {
        int n=map[1].size();
        return n==size;
    }
    
    public boolean one() {
       int n=map[1].size();
        return n>0;
    }
    
    public int count() {
        return map[1].size();
    }
    
    public String toString() {
        StringBuilder s=new StringBuilder(size);
        for(int i=0;i<size;i++){
            if(map[1].contains(i)){
                s.append("1");
            }else{
                s.append("0");
            }
        }
        return s.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */
