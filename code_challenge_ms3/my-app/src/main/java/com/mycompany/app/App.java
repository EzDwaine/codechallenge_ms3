package com.mycompany.app;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    private static final String fileName  = "C:\\Users\\ezequ\\OneDrive\\Desktop\\code_challenge_ms3\\resources\\csv_file.csv";

    public static void main(String[] args) throws IOException {
        AtomicReference<File> wrongFormatFile = null;
        Logger LOGGER = Logger.getLogger(App.class.getName());
        Path myPath = Paths.get(fileName);

        jdbc:sqlite:C:\sqlite\db\input-filename.db
        try (
                connection con.setAutoCommit(false);
        BufferedReader br = Files.newBufferedReader(myPath,
                StandardCharsets.UTF_8)) {

            HeaderColumnNameMappingStrategy<Columns> strategy = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(Columns.class);

            List<Columns> list =  new ArrayList<>();
            final CsvToBean<Columns> csvToBean = new CsvToBeanBuilder<Columns>(br)
                    .withType(Columns.class)
                    .withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withThrowExceptions(false)
                    .build();


            List<Columns> columns = csvToBean.parse();
            //columns.forEach(System.out::println);
            csvToBean.getCapturedExceptions().forEach((Columns)->{
                assert wrongFormatFile != null;
                wrongFormatFile.set(newFile());
               System.out.println(Columns.toString());
                    });

            if(!columns.contains("")){

            }
            else{
                if(wrongFormatFile.get() ==null){
                    wrongFormatFile.get();
                    newFile();
                }
            }

    }

}  private static File newFile(){
        return new File("inputfilename-bad" + ".csv");
    }

}
