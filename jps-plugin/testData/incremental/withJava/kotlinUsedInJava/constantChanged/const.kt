package test

class Klass {
    default object {
        // Old and new constant values are different, but their hashes are the same
        val CONST = "BF"
    }
}
