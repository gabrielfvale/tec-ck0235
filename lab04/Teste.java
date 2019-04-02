class Teste {
    public static void main(String args[]) {
        Sistema s = new Sistema();
        s.criarContaXPTOBasic(1);
        s.criarContaXPTOPlus(2);
        s.criarContaXPTOExtreme(3);

        for(int i = 1; i<=3; i++) s.creditar(i, 1000);

        for(int i = 1; i<=3; i++) s.debitar(1, 10);
    }
}