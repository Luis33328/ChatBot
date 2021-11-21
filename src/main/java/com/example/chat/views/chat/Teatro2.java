package com.example.chat.views.chat;

import java.util.ArrayList;

import java.util.List;



public class Teatro2 {

    private String[] lugares = new String[25];



    public String comprarIngresso(String nome , int numeroLugar) {



        try {



            if (lugares[numeroLugar - 1] == null) {

                lugares[numeroLugar - 1] = nome;

                return "Lugar " + (numeroLugar) + " reservado com sucesso";

            } else {

                return "Lugar Ocupado";

            }



        } catch (ArrayIndexOutOfBoundsException ai) {

            return "Lugar inválido";

        }



    }





    public String obterLugaresOcupados() {

        List<Integer> listaLugares = new ArrayList<>();



        for (int posicao = 0; posicao < lugares.length; posicao++) {



            if (lugares[posicao] != null) {

                listaLugares.add(posicao);

            }

        }

        return "Lugares Ocupados -> " + listaLugares.toString();



    }



    public String obterLugaresVazios() {

        List<Integer> listaLugares = new ArrayList<>();



        for (int posicao = 0; posicao < lugares.length; posicao++) {



            if (lugares[posicao] == null) {

                listaLugares.add(posicao+1);

            }

        }

        return "Lugares Ocupados -> " + listaLugares.toString();



    }



}