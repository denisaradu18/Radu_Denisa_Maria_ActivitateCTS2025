package ro.cts.main;

import ro.cts.classes.*;

public class Main {
    public static void main(String[] args)  {
        AgentieEager agentieEager=AgentieEager.getInstance();
        AgentieEager agentieEager1=AgentieEager.getInstance();
        System.out.println(agentieEager);
        agentieEager1.setCapital(50000);
        System.out.println(agentieEager1);

        AgentieLazy agentieLazy=AgentieLazy.getInstance("AgentieLazy", 80000, 90);
        System.out.println(agentieLazy);
        AgentieLazy agentieLazy1=AgentieLazy.getInstance("AgentiaFoarteLazy", 87654,90);
        agentieLazy1.setNrAngajati(77);
        System.out.println(agentieLazy1);

        AgentieStaticBlock agentieStaticBlock=AgentieStaticBlock.getInstance();
        System.out.println(agentieStaticBlock);
        AgentieStaticBlock agentieStaticBlock1=AgentieStaticBlock.getInstance();
        agentieStaticBlock1.setNrAngajati(10);
        System.out.println(agentieStaticBlock1);

        AgentieSerialization agentieSerialization=AgentieSerialization.getInstance("AgentieNoua", 100,2);
        System.out.println(agentieSerialization);

        CameraSingletone cameraSingletone=CameraSingletone.getInstance(235,3);
        System.out.println(cameraSingletone);
    }
}
