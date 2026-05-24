// bookAuthor.js

const books = [];

function book (title,publisher,author){
	return {
		title,
		publisher,
		author
	}
}

const person = (name,age)=> {
	return {
		name,
		age
	}
}

const john = person("John",22);
const jasmine = person("Jasmine",30);

const jsbook = book("Js Programming","Acme Publishing",john);
const javabook = book("Java Programming","James Publishing",john);
const postgres = book("Postgres Db","CCP Publishing",jasmine)

books.push(jsbook);
books.push(javabook);
books.push(postgres);

const booksOfJohn = books.filter((book)=> book.author.name == "John")
console.log(booksOfJohn)