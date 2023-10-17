function reverseWords(sentence) {
    const words = sentence.split(" ");
    const reversedWords = words.map((word) => {
        return word.split("").reverse().join("");
    });
    return reversedWords.join(" ");
}

const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout,
});

readline.question("Enter a sentence: ", (sentence) => {
    const reversedSentence = reverseWords(sentence);
    console.log(reversedSentence);
    readline.close();
});