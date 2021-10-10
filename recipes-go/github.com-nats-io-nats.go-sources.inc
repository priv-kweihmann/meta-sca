SRC_URI += "https://proxy.golang.org/github.com/nats-io/nats.go/@v/v1.13.0.zip;srcoutput=github.com/nats-io/nats.go;srcinput=github.com/nats-io/nats.go@v1.13.0;downloadfilename=github-com-nats-io-nats-go-1.13.0.zip;name=github-com-nats-io-nats-go"
SRC_URI[github-com-nats-io-nats-go.sha256sum] = "77590cdc9e5de92ac61e76a26b88dc1b382b12eabdc73e056dc27c22358faa7c"
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
