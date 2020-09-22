import metodos as metodos
import BuscaIterativa.busca_sequencial as busc_seq
import BuscaIterativa.busca_binaria as busc_bin

print('\n\r#######  GERENCIADOR DE LISTA DE JOGOS #######')
while True:
    print('\n\r[1] Exibir lista de jogos')
    print('[2] Adicionar jogo')
    print('[3] Remover jogo')
    print('[4] Buscar por um jogo usando busca binária')
    print('[5] Buscar por um jogo usando busca sequencial')
    print('[0] Sair')

    entrada = int(input('Escolha uma das opções acima: '))

    if entrada == 1:
        metodos.ExibirLista(listaDeJogos)

    if entrada == 2:
        metodos.AdicionarJogo()
    
    if entrada == 3:
        metodos.RemoverJogo()
    
    if entrada == 4:
        BuscaSequencial()

    if entrada == 5:
        BuscaBinaria()

    if entrada == 0:
        break
        
