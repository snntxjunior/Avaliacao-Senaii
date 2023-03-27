package avaliacao.ds1;

public class Main {
    public static void main(String[] args) {
        
        Juridica juridica1 = new Juridica("000.000.000/0001-00", "0000000", 5478, "Junior", "00 00000-0000", "teste@gmail.com", 
                             new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
                
        System.out.println(juridica1.toString());
        
        Cliente cliente1 = new Cliente(000000000000, 25, Genero.FEMININO, 458741, "Gisele", "00 00000-0000", "teste@gmail.com", 
                          new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(cliente1.toString());
        
        Advogado advogado1 = new Advogado("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.JURIDICO, 2700, 25, Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
                             new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
     
        
        System.out.println(advogado1.toString());
        
        Medico medico1 = new Medico("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.SAUDE, 2700, 25, Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
                             new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(medico1.toString());
        
        Engenheiro engenheiro1 = new Engenheiro("0000000", "000.000.000-00", "00.000.000-00", "000000", Setor.ENGENHARIA, 2700, 25, Genero.FEMININO, 481646, "Jessica", "00 00000-0000 ", "teste@gmail.com", 
                             new Endereco("Monte Serrat", "88", "Apos o Beco da Morte", "00000-000", "Salvador", UnidadeFederativa.BAHIA));
        
        
        System.out.println(engenheiro1.toString());
        
    }
}
