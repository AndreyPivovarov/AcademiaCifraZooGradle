package ru.academy.zoo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import ru.academy.zoo.exception.AddTypeAnimalException;
import ru.academy.zoo.exception.AgeExeption;
import ru.academy.zoo.exception.MaxCapacityException;
import ru.academy.zoo.objects.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        //Configurator.setRootLevel(Level.TRACE);

        try {
            Zoo zoo = Zoo.getInstance();

            Enclosure grEnc = new GroundEnclosure(5, 22);
            Enclosure avEnc = new AviaryEnclosure(5, 7);
            Enclosure swEnc = new SwimEnclosure(3, 10);

            grEnc.addAnimal(new Lion("Лёва", 10));
            grEnc.addAnimal(new Snake("Змей", 15));
            avEnc.addAnimal(new Duck("Скрудж", 3));
            swEnc.addAnimal(new Dolphin("Дима", 4));
            swEnc.addAnimal(new Fish("Шука", 2));

            Worker worker = new Worker("Сергей", new ArrayList<>(List.of(grEnc, avEnc)));
            Worker worker2 = new Worker("Дмитрий", new ArrayList<>(List.of(swEnc)));

            zoo.addWorker(worker);
            zoo.addWorker(worker2);

            zoo.dailyWorks();

        } catch (AgeExeption | MaxCapacityException | AddTypeAnimalException e) {
            log.error("Ошибка", e);
        }

    }
}
