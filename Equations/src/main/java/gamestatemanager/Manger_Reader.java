package gamestatemanager;

public interface Manger_Reader
{
    void setGoalSetter(Player p);
    void setFirstPlayer();
    void setGoal(int[] goal_indexes);
    void setSolver(String str);
    boolean moveDie(Player p, int i, GameMove d);

}
