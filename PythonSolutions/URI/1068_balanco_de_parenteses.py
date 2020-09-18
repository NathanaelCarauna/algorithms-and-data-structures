while True:
    try:
        expression = input()
        count = 0
        for c in expression:
            if c == '(':
                count += 1
            elif c == ')':
                count -= 1
            if (count < 0):  # se o contador for menor que 0, ele fechou um parenteses sem abertura (incorreto)
                break
        if count != 0:
            print('incorrect')
        else:
            print('correct')
    except:
        break
