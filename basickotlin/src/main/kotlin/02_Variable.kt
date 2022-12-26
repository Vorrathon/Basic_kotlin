fun kVariable() {
    var kbyte: Byte
    kbyte = 50
    println(kbyte)
    kbyte = 10
    println(kbyte)

    // ชนิดข้อมูลแบบ Double ไม่สามารถกำหนดจำนวนเต็มให้มันได้ (Java ทำได้)
    // var d1: Double = 100 // Error
    var d2: Double = 100.50
    println(d2)

    // ข้อมูลชนิด Char ต้องอยู่ใน '' เท่านั้น
    var grade: Char = 'A'
    var size: Char = 'M'
    var a: Char = '\u0061' //unicode character เป็นตัว a พิมพ์เล็ก

    println(grade)
    println(size)
    println(a)

    // การกำหนดค่าคงที่ Immutable ( ไม่สามารถเปลี่ยนค่าได้)
    val pi: Float = 3.141f
    val pricePerUnit: Short = 1000
    val lat: Double
    val lon: Double
    lat = 100.12345
    lon = 80.67890
    // lon = 80.00 // Error
    println(pi)
    println(pricePerUnit)
    println(lat)
    println(lon)

    val sum = 0
    val i = 1
}



