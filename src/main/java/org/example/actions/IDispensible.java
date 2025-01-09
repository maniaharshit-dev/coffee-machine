package org.example.actions;

public interface IDispensible {
    void prepare() throws InterruptedException;
    void dispense() throws InterruptedException;
    void cleanup() throws InterruptedException;
    void pauseAfterDispense() throws InterruptedException;
}
