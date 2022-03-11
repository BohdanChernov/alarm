import groovy.sql.Sql

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

println "CURRENT PATH: " + new File(".").getAbsolutePath()

def sql = Sql.newInstance('jdbc:postgresql://35.224.189.15:5432/test',
        'postgres', 'postgres', 'org.postgresql.Driver')

sql.eachRow('SELECT * from test_table') { row ->
    println row
    String id = row.id
    Path newFilePath = Paths.get('files/'+id + '_script.txt')
    if (Files.exists(newFilePath)) {
        Files.delete(newFilePath)
        Files.createFile(newFilePath)
    } else {
        Files.createFile(newFilePath)
    }

}

sql.close()