SRC_URI += "https://proxy.golang.org/github.com/rabbitmq/amqp091-go/@v/v1.3.4.zip;srcoutput=github.com/rabbitmq/amqp091-go;srcinput=github.com/rabbitmq/amqp091-go@v1.3.4;downloadfilename=github-com-rabbitmq-amqp091-go-1.3.4.zip;name=github-com-rabbitmq-amqp091-go"
SRC_URI[github-com-rabbitmq-amqp091-go.sha256sum] = "29becf22bd444ef05fd50c73012f2343ba7e1eb57f7390754bf1e64935dd8634"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rabbitmq/amqp091-go/LICENSE;md5=a21a066a96199e1d9d1d6c27fa0f655b \
"

GOSRC_INCLUDEGUARD += "github.com-rabbitmq-amqp091-go-sources.inc"

