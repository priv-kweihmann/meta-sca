SRC_URI += "https://proxy.golang.org/github.com/nats-io/nats.go/@v/v1.12.3.zip;srcoutput=github.com/nats-io/nats.go;srcinput=github.com/nats-io/nats.go@v1.12.3;downloadfilename=github-com-nats-io-nats-go-1.12.3.zip;name=github-com-nats-io-nats-go"
SRC_URI[github-com-nats-io-nats-go.sha256sum] = "3b42d74cf4c12660c8627d2750ffa0f4fd05e47b6f8d97c5efc2d7105670cce0"
GOSRC_REMOVEDIRS += "github.com/nats-io/nats.go/test"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/nats-io/nats.go/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-nats-io-nats.go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nats-io-nkeys-sources.inc', '', 'github.com-nats-io-nkeys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nats-io-nuid-sources.inc', '', 'github.com-nats-io-nuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
