package by.andrey_zhukov.enums;

import java.util.ArrayList;

@SuppressWarnings("unused")
public enum GameRules {

    B3_S23,
    B2_S01234567,
    B2_S0124567,
    B2_S012345,
    B2_S01234,
    B23_S01234,
    B23_S12345,
    B02468_S1357,
    B123_S456,
    B4_S01278;

    public static final GameRules defaultRules = B3_S23;

    private final ArrayList<Integer> born = new ArrayList<>();
    private final ArrayList<Integer> stay = new ArrayList<>();

    GameRules() {
        String name = String.valueOf(this);
        int i = 1;
        for (; name.charAt(i) != '_'; ++i) {
            this.born.add(Integer.parseInt(String.valueOf(name.charAt(i))));
        }
        i += 2;
        for (; i < name.length(); ++i) {
            this.stay.add(Integer.parseInt(String.valueOf(name.charAt(i))));
        }
    }

    public ArrayList<Integer> getBorn() {
        return born;
    }

    public ArrayList<Integer> getStay() {
        return stay;
    }
}
