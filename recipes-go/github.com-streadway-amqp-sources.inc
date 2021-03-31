SRC_URI_append = " https://proxy.golang.org/github.com/streadway/amqp/@v/v1.0.0.zip;srcoutput=github.com/streadway/amqp;srcinput=github.com/streadway/amqp@v1.0.0;downloadfilename=github-com-streadway-amqp-1.0.0.zip;name=github-com-streadway-amqp"
SRC_URI[github-com-streadway-amqp.sha256sum] = "caf228a40b7909e94fd6c2c70c1875a03eb2a953f97c6885a39bc3f7ad0fbdb7"

MOD_LICENSE_append = " \
    BSD-2-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/streadway/amqp/LICENSE;md5=7444f6ea1dfceff26373f42800a8a72c \
"
