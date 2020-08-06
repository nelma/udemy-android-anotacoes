package com.example.aprenda.minhasanotacoes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencias {

    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private final String NOME_ARQUIVO = "anotacao.preferences";
    private final String CHAVE_NOME = "nome";

    public AnotacaoPreferencias(Context context) {
        this.context = context;

        //O 2º param define que somente esta app poder ler o arquivo
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    public void salvar(String anotacao) {
        editor.putString(CHAVE_NOME, anotacao);
        editor.commit();
    }

    public String recuperar() {
        return preferences.getString(CHAVE_NOME, "");
    }
}
