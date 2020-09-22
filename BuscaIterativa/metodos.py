from jogo import Jogo


id = 0
listaDeJogos = []

def ExibirLista(listaDeJogos):
    if len(listaDeJogos) == 0:
        print('\n\rA lista de jogos está vazia.')
    else:
        for i, item in enumerate(listaDeJogos):
            print(f'{i}. {item}')

def AdicionarJogo():
    id += 1
    nomeDoJogo = input('\n\rDigite o nome do jogo que deseja adicionar: \n\r')
    categoria = input(f'\n\rCategoria do jogo {nomeDoJogo}: \n\r')
    listaDeJogos.append(Jogo(id, nomeDoJogo, categoria))
    print(f'jogo {nomeDoJogo} adicionado')

def RemoverJogo():
    index = int(input('\n\rDigite o index do jogo que deseja remover (Não sabe? Faça uma busca primeiro): \n\r'))
    jogo = listaDeJogos.pop(index)
    print(f'jogo {jogo} removido')