package io.swagger.model;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public List<History> getHistory() {
        List<History> historyList = new ArrayList<>();
        History history = new History();
        for (int i = 1; i < 100; i++) {

            history = new History();

            history.setIdHistory("h" + i);
            Program program = new Program();
            program.setIdProgram("p" + (int) (Math.random() * 10) );
            history.setProgram(program);

            history.setDate(new DateTime());
            if ((int) (Math.random() * 10) % 2 == 0)
                history.setUsername("pepe");
            else
                history.setUsername("lalo");
            historyList.add(history);
        }

        return historyList;
    }

    public List<Program> getPrograms() {
        List<Program> programList = new ArrayList<>();
        Program program = new Program();
        for (int i = 1; i < 10; i++) {

            program = new Program();

            program.setIdProgram("p" + i);
            program.setName("Program " + i);
            program.setDateAdded(new DateTime());
            program.setStatus(1);
            program.setDescription("Descripción " + i);
            programList.add(program);
        }

        return programList;
    }

    public Program getProgram() {
        Program program = new Program();
        program.setIdProgram("p999");
        program.setName("Programa específico");
        program.setStatus(1);
        program.setDateAdded(new DateTime());
        return program;
    }
}
