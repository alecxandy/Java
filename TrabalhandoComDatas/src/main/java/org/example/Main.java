package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //data no formato yyyy-mm-dd
        LocalDate localDate = LocalDate.now();
        System.out.println("Data: " + localDate);

        //hora, minutos, segundos e milesegundos
        LocalTime localTime = LocalTime.now();
        System.out.println("Hora: " + localTime);

        //data e hora
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data e hora: " + localDateTime);
        System.out.println("Dia do mês " + localDateTime.getDayOfMonth());
        System.out.println("Dia do ano: " + localDateTime.getDayOfYear());
        System.out.println("Ano: " + localDateTime.getYear());

        //Data formatada padrao brasil
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("dd MM yyyy", new Locale("pt", "br"));
        System.out.println("Data formatada: " + localDateTime.format(dateTimeFormatter));

        //data, hora, minutos, milesegundos e zona
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZoneDataTime: " + zonedDateTime);

        //recebendo uma string como data no padrao ISO
        LocalDateTime localDateTime1 = LocalDateTime.parse("1988-05-23T10:45:10");
        System.out.println(localDateTime1);

        //Operações com datas
        LocalDate hoje = LocalDate.parse("2022-08-03");
        System.out.println("hoje: " + hoje);
        //adicionando um dia a data requisitada
        LocalDate amanha = hoje.plus(1, ChronoUnit.DAYS);
        System.out.println("Amanha: " + amanha);
        //Subtraindo um dia
        LocalDate ontem = hoje.minus(1, ChronoUnit.DAYS);
        System.out.println("Ontem: " + ontem);
        //comparações com datas
        System.out.println("Ontem é depois de hoje? "+ontem.isAfter(hoje));
        System.out.println("Hoje é antes de ontem? "+hoje.isBefore(ontem));
    }
}