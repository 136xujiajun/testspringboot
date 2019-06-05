package designPattern.facade;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

/**
 * Created by HP-8560p on 2018/9/10.
 */
public class Computer {

    private Cpu  cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }
    public void startup(){
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start the finished");
    }

    public void shutdown(){
        System.out.println("begin to close the computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed");
    }
}
