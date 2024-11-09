/*
class CharactersService(
    private val charactersRepository: CharactersRepository,
) {
    suspend fun getCharacters(): List<Character> {
        val timestamp = getTimeMillis()
        val characters =
            charactersRepository.getCharacters(
                timestamp,
                md5(timestamp.toString() + PRIVATE_KEY + PUBLIC_KEY),
            )
        return sort(characters)
    }

    private fun md5(string: String): String {
        val MD5 = "MD5"
        try {
            // Create MD5 Hash
            val digest =
                MessageDigest
                    .getInstance(MD5)
            digest.update(string.toByteArray())
            val messageDigest = digest.digest()

            // Create Hex String
            val hexString = StringBuilder()
            for (aMessageDigest in messageDigest) {
                var h = Integer.toHexString(0xFF and aMessageDigest.toInt())
                while (h.length < 2) h = "0$h"
                hexString.append(h)
            }
            return hexString.toString()
        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        }
        return ""
    }

    private fun sort(characters: List<Character>): List<Character> = characters.sortedWith(CharacterComparator())

    private class CharacterComparator : Comparator<Character> {
        override fun compare(
            c1: Character,
            c2: Character,
        ): Int {
        }
    }
}
*/
