package Test.MyTest

class A {
    default object {
        public fun testOther(a: Int) {

        }
    }
}

fun testMy() {
    A.testOthe<caret>
}