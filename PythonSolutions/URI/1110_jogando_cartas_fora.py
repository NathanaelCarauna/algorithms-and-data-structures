while True:
    n = int(input())

    if n == 0:
        break

    pilha = []
    for i in range (1, n+1):
        pilha.append(i)

    discartadas = []
    while len(pilha) >= 2:
        discartadas.append(pilha.pop(0))
        pilha.insert(len(pilha)-1, pilha.pop(0))
    
    print("Discarded cards: " + str(discartadas).replace("[","").replace("]",""))
    print("Remaining card: " + str(pilha[0]))