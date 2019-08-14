public class Magical extends Player implements SuperAbilityApplicable {

    private int supperKick;

    public int getSupperKick() {
        return supperKick;
    }

    public void setSupperKick(int supperKick) {
        this.supperKick = supperKick;
    }

    @Override
    public void superAbility() {
        System.out.println("Применена супер способность <Волшебная палочка> ");
    }
}
