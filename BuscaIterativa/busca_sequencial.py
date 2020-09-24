def BuscaSequencial(lista, identificador):
    for item in lista:
        if item.id == identificador or item.nome == identificador:
            return item