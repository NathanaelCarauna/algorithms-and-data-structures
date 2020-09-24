def BuscaBinaria(lista, identificador):
    if len(lista)>1:
        meio = len(lista)//2
        if lista[meio].id == identificador:
            return lista[meio]
        elif lista[meio].id > identificador:
            return BuscaBinaria(lista[:meio], identificador)
        else:
            return BuscaBinaria(lista[meio:], identificador)
    else:
        return None