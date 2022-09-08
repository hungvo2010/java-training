public class EqualMethod {
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        EqualMethod other = (EqualMethod) obj;
        return true;
    }
    
}
