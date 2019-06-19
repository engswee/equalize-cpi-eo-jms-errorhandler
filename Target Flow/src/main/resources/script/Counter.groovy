import com.sap.gateway.ip.core.customdev.util.Message

Message processData(Message message) {
    Reader reader = message.getBody(Reader)
    def root = new XmlSlurper().parse(reader)
    int count = Integer.parseInt(root.count.text())
    message.setBody("Count is ${count}")
    return message
}