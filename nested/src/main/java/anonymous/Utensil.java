package anonymous;

/**
 * Represents general home utensil.
 */
public abstract class Utensil {
    private String name;
    private String purpose;
    
    public Utensil(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }
    
    public abstract void use();

    public void setName(String name) {
        this.name = name;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return "Utensil{" +
                "name='" + name + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }


}
