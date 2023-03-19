package CTS.practice.creationale.PROTOTYPE.problema1;

public interface IReteta extends Cloneable {
    IReteta creazaCopie() throws CloneNotSupportedException;
}
