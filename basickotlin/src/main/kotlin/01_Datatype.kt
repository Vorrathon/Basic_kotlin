fun kDatatype() {
    // Signed Integral Type
    println("# Signed Integral Type\n---------------")
    //var เปลี่ยนค่าได้
    //val เปลี่ยนค่าไม่ได้
    // val ชื่อตัวแปร: ชนิดข้อมูล = ค่าที่เก็บ
    val kByte: Byte = 120 // byte ได้ แค่ -128 ถึง 127
    val kShort: Short = 20_000 // -32768 to 32767 ไม่เห็น underscore
    val kInt: Int = 10
    val kLong: Long =333333333333333_333
    println(kByte)
    println(kShort)
    println(kInt)
    println(kLong)
    println("มีค่าเท่ากับ $kInt") // ใส่ค่าตัวแปรใน string ได้

    println("\n# Floating Point Type\n---------------------")
    val kFloat: Float = 3.4028235E38F // 1.4E-45 to 3.4028235E38
    val kDouble: Double = 1.7976931348623157E308 // 4.9E-324 to 1.7976931348623157E308
    println("kFloat=$kFloat")
    println("kDouble=$kDouble")

    println("\n# Boolean Type\n---------------------")
    val kBoolean1: Boolean = true
    val kBoolean2: Boolean = false
    println("kBoolean1=$kBoolean1")
    println("kBoolean2=$kBoolean2")


    println("\n# String Type\n---------------------")
    val kChar: Char = 'S' // ถ้าเป็น char ใช้ single Quote เท่านั้น
    val kString: String = "Vorrathon Kedpratoom"
    println("kChar=$kChar")
    println("kString=$kString")

    println("\n# Any Type\n---------------------")
    val kAny1: Any = 20
    val kAny2: Any = 100.50
    val kAny3: Any = true
    val kAny4: Any = "John"
    println("kAny1=$kAny1")
    println("kAny2=$kAny2")
    println("kAny3=$kAny3")
    println("kAny4=$kAny4")

}