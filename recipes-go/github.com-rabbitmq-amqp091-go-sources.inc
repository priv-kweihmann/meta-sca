SRC_URI += "https://proxy.golang.org/github.com/rabbitmq/amqp091-go/@v/v1.1.0.zip;srcoutput=github.com/rabbitmq/amqp091-go;srcinput=github.com/rabbitmq/amqp091-go@v1.1.0;downloadfilename=github-com-rabbitmq-amqp091-go-1.1.0.zip;name=github-com-rabbitmq-amqp091-go"
SRC_URI[github-com-rabbitmq-amqp091-go.sha256sum] = "69b92ccc30ddad3c31df3c99767e9bdaa7daab81c07f07f0f3b29c4a8b02c403"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rabbitmq/amqp091-go/LICENSE;md5=a21a066a96199e1d9d1d6c27fa0f655b \
"

GOSRC_INCLUDEGUARD += "github.com-rabbitmq-amqp091-go-sources.inc"

