package com.example.guilherme.demoappdress.Interfaces.Schema;

/**
 * Created by Guilherme on 24/04/2016.
 */
public interface IPecaSchema {

    String PECA_TABLE = "peca";
    String COLUMN_ID = "id";
    String COLUMN_NOME = "nome";
    String COLUMN_LOJA_ID = "loja_id";
    String COLUMN_TIPO_PECA = "tipo_peca";
    String COLUMN_IMAGEM = "imagem";
    String COLUMN_GENERO = "genero";
    String COLUMN_PRECO = "preco";
    String COLUMN_LINK = "link";

    String[] PECA_COLUMNS = new String[] { COLUMN_ID, COLUMN_LOJA_ID, COLUMN_TIPO_PECA, COLUMN_NOME,
            COLUMN_IMAGEM, COLUMN_GENERO, COLUMN_PRECO, COLUMN_LINK};

    String PECA_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
            + PECA_TABLE
            + " ("
            + COLUMN_ID
            + " INTEGER PRIMARY KEY, "
            + COLUMN_LOJA_ID
            + " INTEGER NULL, "
            + COLUMN_TIPO_PECA
            + " INTEGER NULL, "
            + COLUMN_NOME
            + " VARCHAR(50) NULL, "
            + COLUMN_IMAGEM
            + " VARCHAR(50) NULL, "
            + COLUMN_GENERO
            + " CHAR(1) NULL, "
            + COLUMN_PRECO
            + " DECIMAL(5,2) NULL, "
            + COLUMN_LINK
            + " VARCHAR(200) NULL "
            + ")";

    String PECA_TABLE_INSERT = "INSERT INTO " + PECA_TABLE + " ( "
            + COLUMN_LOJA_ID +" , " + COLUMN_TIPO_PECA + " , " + COLUMN_NOME + " , "
            + COLUMN_IMAGEM +" , " + COLUMN_GENERO + " , " + COLUMN_PRECO + " , " + COLUMN_LINK
            + ") VALUES "
            + "   (1, 2, '', '', 'U', 49.90, "+"\"http://www.lojasrenner.com.br/p/gorro-com-pompom-539085319-539085327\""+") "
            + ",  (1, 2, '', '', 'U', 39.90, "+"\"http://www.lojasrenner.com.br/p/gorro-listrado-539073262-539075284\""+") "
            + ",  (3, 3, '', '', 'M', 79.00, "+"\"http://www.cea.com.br/oculos-quadrado-masculino-oneself-marrom-escuro-8325300-marrom_escuro/p\""+") "
            + ",  (3, 3, '', '', 'F', 69.90, "+"\"http://www.cea.com.br/oculos-quadrado-feminino-oneself-marrom-8313779-marrom/p\""+") "
            + ",  (4, 18, '', '', 'U', 19.90, "+"\"http://www.marisa.com.br/kit-3-pares-de-meias-mash-10012998708-44309-branco-detalhe\""+") "
            + ",  (1, 20, '', '', 'M', 99.90, "+"\"http://www.lojasrenner.com.br/p/tenis-masculino-satinato-genuine-em-lona-539661865-539661890\""+") "
            + ",  (1, 20, '', '', 'F', 129.90, "+"\"http://www.lojasrenner.com.br/p/tenis-converse-skid-grip-feminino-em-lona-536111825-536112369\""+") "
            + ",  (1, 21, '', '', 'M', 209.00, "+"\"http://www.lojasrenner.com.br/p/bota-masculina-satinato-genuine-coturno-em-couro-539462225-539462250\""+") "
            + ",  (1, 21, '', '', 'F', 289.00, "+"\"http://www.lojasrenner.com.br/p/bota-feminina-bottero-montaria-em-couro-539616773-539616837\""+") "
            + ",  (1, 23, '', '', 'F', 89.90, "+"\"http://www.lojasrenner.com.br/p/sandalia-feminina-satinato-vazada-538361967-539122175\""+") "
            + ",  (1, 5, '', '', 'M', 109.00, "+"\"http://www.lojasrenner.com.br/p/camisa-em-jeans-538639594-540024716\""+") "
            + ",  (4, 5, '', '', 'F', 79.95, "+"\"http://www.marisa.com.br/camisa-feminina-manga-longa-10024846998-166532-preto-detalhe\""+") "
            + ",  (1, 4, '', '', 'M', 89.90, "+"\"http://www.lojasrenner.com.br/p/camisa-jeans-estampada-538742962-538742971\""+") "
            + ",  (4, 4, '', '', 'F', 59.95, "+"\"http://www.marisa.com.br/camisa-feminina-estampa-abstrata-manga-curta-10024793131-165637-preto-detalhe\""+") "
            + ",  (3, 13, '', '', 'F', 159.99, "+"\"http://www.cea.com.br/saia-herchcovitch-em-renda-preta-8239125-preto/p\""+") "
            + ",  (1, 14, '', '', 'M', 79.90, "+"\"http://www.lojasrenner.com.br/p/bermuda-em-microfibra-538593186-538985850\""+") "
            + ",  (3, 11, '', '', 'F', 79.90, "+"\"http://www.cea.com.br/calca-jeans-super-skinny-azul-medio-7936103-azul_medio/p\""+") "
            + ",  (4, 11, '', '', 'M', 99.99, "+"\"http://www.marisa.com.br/calca-masculina-em-jeans-10025730753-158470-jeans-detalhe?v=62881\""+") "
            + ",  (1, 10, '', '', 'F', 79.90, "+"\"http://www.lojasrenner.com.br/p/regata-em-jeans-539698545-539698588\""+") "
            + ",  (1, 10, '', '', 'M', 89.90, "+"\"http://www.lojasrenner.com.br/p/regata-esportiva-adidas-538314554-538314626\""+") "
            + ",  (2, 22, '', '', 'M', 58.90, "+"\"http://www.dafiti.com.br/Chinelo-Aleatory-Golf-Azul-Marinho-2037543.html\""+") "
            + ",  (2, 22, '', '', 'F', 24.90, "+"\"http://www.dafiti.com.br/Sandalia-Ipanema-Mari-Branca-1838387.html\""+") "
            + ",  (3, 7, '', '', 'F', 249.99, "+"\"http://www.cea.com.br/casaco-em-suede-caramelo-8178157-caramelo/p\""+") "
            + ",  (1, 7, '', '', 'M', 259.00, "+"\"http://www.lojasrenner.com.br/p/jaqueta-bomber-538714945-538715008\""+") "
            + ",  (1, 25, '', '', 'U', 25.90, "+"\"http://www.lojasrenner.com.br/p/luva-basica-539083823-539083840\""+") "
            + ",  (4, 1, '', '', 'M', 25.99, "+"\"http://www.marisa.com.br/bone-masculino-com-bordado-la-10024379908-159276-jeans-detalhe\""+") "
            + ",  (2, 0, '', '', 'F', 59.99, "+"\"http://www.dafiti.com.br/Chapeu-FiveBlu-Floppy-Conchas-Bege-1901095.html\""+") "
            + ",  (3, 26, '', '', 'F', 49.99,"+"\"http://www.cea.com.br/cinto-bicolor-herchcovitch-preto-8264660-preto/p\""+") "
            + ",  (2, 26, '', '', 'M', 39.90, "+"\"http://www.dafiti.com.br/Cinto-Pierre-Cardin-Preto-1678816.html\""+") "
            + ",  (4, 24, '', '', 'F', 49.99, "+"\"http://www.marisa.com.br/cachecol-feminino-com-franjas-10024700436-158597-vermelho-detalhe\""+") "
            + ",  (2, 24, '', '', 'M', 59.99, "+"\"http://www.dafiti.com.br/Cachecol-Colcci-Xadrez-Preto%2FBranco-1977059.html\""+") "
            + ",  (2, 9, '', '', 'F', 169.90, "+"\"http://www.dafiti.com.br/Blusao-Colcci-Lovers-Cinza-2011820.html\""+") "
            + ",  (3, 9, '', '', 'M', 89.99, "+"\"http://www.cea.com.br/sueter-em-trico-com-estampa-azul-marinho-8165254-azul_marinho/p\""+") "
            + ",  (2, 6, '', '', 'U', 47.90, "+"\"http://www.dafiti.com.br/Camiseta-Manga-Longa-Question-Sport-Termica-Run-Preta-2066185.html\""+") "
            + ",  (2, 12, '', '', 'U', 80.90, "+"\"http://www.dafiti.com.br/Calca-Legging-Question-Sport-Termica-Run-Preta-2066093.html\""+") "
            + ",  (2, 19, '', '', 'U', 99.90, "+"\"http://www.dafiti.com.br/Meia-Termica-Fiero-Dupla-Camada-Azul-Marinho-1983240.html\""+") "
            + ",  (2, 8, '', '', 'M', 621.80, "+"\"http://www.dafiti.com.br/Sobretudo-fiero-em-la-moscow-cinza-escuro-2101964.html\""+") "
            + ",  (4, 8, '', '', 'U', 229.95, "+"\"http://www.marisa.com.br/casaco-feminino-modelo-trench-coat-10024667760-160947-azul-detalhe\""+") "
            + ""
            + ";";
}
