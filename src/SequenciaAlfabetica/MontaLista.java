package SequenciaAlfabetica;

import java.util.ArrayList;
import java.util.List;

public class MontaLista {

    static String[] nomesFornecidos = new String[5];

    //    this.nomesFornecidos = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};
    public  MontaLista() {


        nomesFornecidos[0] = "acbda";
        nomesFornecidos[1] = "fasdlkh";
        nomesFornecidos[2] = "poiwqd";
        nomesFornecidos[3] = "zxcqwtop";
        nomesFornecidos[4] = "qfgophl";
    }
    public void geraSequencia() {

        List<String> nomesOrdenados = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            int ponteiro = 0;
            int indinicial = 0;
            int indfinal = 1;

            while (indfinal < nomesFornecidos[i].length()) {

                while (nomesFornecidos[i].charAt(indinicial) < nomesFornecidos[i].charAt(indfinal)) {
                    indinicial = indfinal;
                    indfinal = indfinal + 1;
                    if (indfinal >= nomesFornecidos[i].length()) {
                        break;
                    }
                }
                nomesOrdenados.add(nomesFornecidos[i].substring(ponteiro, indfinal));
                indinicial = indfinal;
                indfinal = indfinal + 1;
                ponteiro = indinicial;

            }

        }

        String nomeImprime = "";
        String nomeAux = "";

        for (int j = 0; j < nomesOrdenados.size(); j++) {
            nomeAux = nomesOrdenados.get(j);
            if (nomeImprime.length() < nomeAux.length()) {
                nomeImprime = nomeAux;
            }
        }
        //   System.out.println(nomesOrdenados.toString());
        System.out.println("A maior sequencia é " + nomeImprime);
    }
}



