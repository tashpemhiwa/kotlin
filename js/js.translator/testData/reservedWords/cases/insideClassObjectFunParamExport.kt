package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    default object {
        fun foo(export: String) {
    assertEquals("123", export)
    testRenamed("export", { export })
}

        fun test() {
            foo("123")
        }
    }
}

fun box(): String {
    TestClass.test()

    return "OK"
}