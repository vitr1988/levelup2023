package ru.levelup.lesson6;

import java.util.Objects;

public class CloneExample implements Cloneable {

    private int index;
    private boolean flag;

    private Example example;

    public CloneExample(int index, boolean flag, String word) {
        this.index = index;
        this.flag = flag;
        this.example = new Example(word);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Example getExample() {
        return example;
    }

    @Override
    public String toString() {
        return "CloneExample{" +
                "index=" + index +
                ", flag=" + flag +
                ", example=" + example +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneExample clone = (CloneExample) super.clone();
        clone.example = (Example) clone.example.clone();
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloneExample that = (CloneExample) o;
        return index == that.index
                && flag == that.flag
                && Objects.equals(example, that.example);
    }

    @Override
    public int hashCode() {
        int basic = 17;
        return basic * index + (flag ? 1 : 0) + example.hashCode();
//        return 125; // bad practice
    }
}
