tests = int(input())

for i in range(tests):
	mine = input()
	diamonds = 0
	fragments = 0
	for j in range(len(mine)):
		if(mine[j] == "<"):
			fragments += 1
		if(mine[j] == ">" and fragments > 0):
			diamonds += 1
			fragments -= 1

	print(diamonds)