def randomInt(def min, def max) {
	Random rand = new Random()
	rand.nextInt((max - min) + 1) + min
}

def addition() {
	def questions = []
	(1..20).each {
		int left = randomInt(100, 1000)
		int right = randomInt(100, 1000)
		int answer = left + right
		questions << "${left} + ${right} = ,${answer}"
	}
	File dict = new File('addition-eight-hundreds.txt')
	dict << questions.join('\r\n')
}

def substraction() {
	def questions = []
	(1..20).each {
		int left = randomInt(100, 1000)
		int right = randomInt(100, left)
		int answer = left - right
		questions << "${left} - ${right} = ,${answer}"
	}
	File dict = new File('substraction-eight-hundreds.txt')
	dict << questions.join('\r\n')
}

def multiply() {
	def seed = [4,5,6,7,8,9]
	def questions = []
	seed.each { left ->
		seed.each { right ->
			def answer = left * right
			questions << "${left} x ${right} = ,${answer}"
		}
	}
	new File('multiply-upto-nine.txt') << questions.join('\r\n')
}

def divide() {
	def seed = [4,5,6,7,8,9]
	def questions = []
	seed.each { left ->
		seed.each { right ->
			def answer = left * right
			questions << "${answer} : ${right} = ,${left}"
		}
	}
	new File('division-upto-nine.txt') << questions.join('\r\n')
}

multiply()
divide()