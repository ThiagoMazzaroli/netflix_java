
public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar(){
        buscarPreferenciasUsuario();
        buscarResolucaoUsuario();
    }

    private void  buscarPreferenciasUsuario(){
        idiomaPreferencial = "PT-BR";
        }

    private void buscarResolucaoUsuario(){
        resolucaoTela  = "Full HD";
    }

    public void assistirFilme(String nomeFilme){
        System.out.println("Assistindo o filme " + nomeFilme);
        System.out.println("Carregando filme na resolução: " + resolucaoTela);
        buscarAudioFilme();
    }

    private void buscarAudioFilme(){
        if(idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
            System.out.println("carregando no idioma: " + idiomaPreferencial);
        } else {
            System.out.println("carregando no idioma: EN-US");
        }
    }
}


