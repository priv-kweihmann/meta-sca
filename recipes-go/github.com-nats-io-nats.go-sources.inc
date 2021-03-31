SRC_URI_append = " https://proxy.golang.org/github.com/nats-io/nats.go/@v/v1.10.0.zip;srcoutput=github.com/nats-io/nats.go;srcinput=github.com/nats-io/nats.go@v1.10.0;downloadfilename=github-com-nats-io-nats-go-1.10.0.zip;name=github-com-nats-io-nats-go"
SRC_URI[github-com-nats-io-nats-go.sha256sum] = "4b22b2d2b9de02969cb4320595e28ac5e404fbf53f6a9fa0d93ef38206489db7"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/nats-io/nats.go/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
