import busca_sequencial as bsequencial
import busca_binaria as bbinaria
from jogo import Jogo

listaDeJogos = []
identificador = 0

listaDeJogos.append(Jogo(0, 'Skirym', 'RPG'))
listaDeJogos.append(Jogo(1, 'God Of War', 'Fantasia'))
listaDeJogos.append(Jogo(2, 'Minecraft', 'Sandbox'))
listaDeJogos.append(Jogo(3, 'Minecraft', 'Sandbox'))
listaDeJogos.append(Jogo(4, 'Batlefield', 'FPS'))
listaDeJogos.append(Jogo(5, 'League Of Legends', 'Moba'))
listaDeJogos.append(Jogo(6, 'Age of Empires', 'Estratégia'))
listaDeJogos.append(Jogo(7, 'Age of Mitology', 'Estratégia'))
listaDeJogos.append(Jogo(8, 'Dragons Dogma', 'RPG'))
listaDeJogos.append(Jogo(9, 'The Division', 'Tiro'))


def ExibirLista(listaDeJogos):
    if len(listaDeJogos) == 0:
        print('\n\rA lista de jogos está vazia.')
    else:
        for item in listaDeJogos:
            print(f'{item.id}. {item.nome}, {item.categoria}')

def AdicionarJogo(identificador):
    try:
        identificador = listaDeJogos[-1].id + 1
    except:
        pass
    nomeDoJogo = input('\n\rDigite o nome do jogo que deseja adicionar: \n\r')
    categoria = input(f'\n\rCategoria do jogo {nomeDoJogo}: \n\r')
    listaDeJogos.append(Jogo(identificador, nomeDoJogo, categoria))
    print(f'jogo {nomeDoJogo} adicionado')

print('\n\r#######  GERENCIADOR DE LISTA DE JOGOS #######')
while True:
    print('\n\r[1] Exibir lista de jogos')
    print('[2] Adicionar jogo')
    print('[3] Buscar por um jogo usando busca sequencial')
    print('[4] Buscar por um jogo usando busca binária')
    print('[0] Sair')

    entrada = int(input('Escolha uma das opções acima: '))

    if entrada == 1:
        ExibirLista(listaDeJogos)

    if entrada == 2:
        AdicionarJogo(identificador)
        identificador += 1
    
    if entrada == 3:
        print('\n\rBUSCA SEQUENCIAL')
        identificador = int(input('Entre com o IDENTIFICADOR ou NOME do jogo que deseja pesquisar: '))
        jogo = bsequencial.BuscaSequencial(listaDeJogos, identificador)
        if jogo == None:
            print('Jogo não encontrado. Adicione o novo jogo ou exiba a lista completa e certifique-se que existe.')
        else:
            print(f'Jogo: {jogo.nome}, Categoria: {jogo.categoria}, ID: {jogo.id}')

    if entrada == 4:
        print('\n\rBUSCA BINARIA')
        identificador = int(input('Entre com o identificador do jogo que deseja pesquisar:'))
        jogo = bbinaria.BuscaBinaria(listaDeJogos, identificador)
        if jogo == None:
            print('Jogo não encontrado. Adicione o novo jogo ou exiba a lista completa e certifique-se que existe.')
        else:
            print(f'Jogo: {jogo.nome}, Categoria: {jogo.categoria}, ID: {jogo.id}')
    if entrada == 0:
        break