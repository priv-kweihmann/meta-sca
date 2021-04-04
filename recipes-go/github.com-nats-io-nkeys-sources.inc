SRC_URI += "https://proxy.golang.org/github.com/nats-io/nkeys/@v/v0.3.0.zip;srcoutput=github.com/nats-io/nkeys;srcinput=github.com/nats-io/nkeys@v0.3.0;downloadfilename=github-com-nats-io-nkeys-0.3.0.zip;name=github-com-nats-io-nkeys"
SRC_URI[github-com-nats-io-nkeys.sha256sum] = "9383fa98356bb67ba1110814918e9997fdbcb83c08ffd6902b5aed7b9d96dfa2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/nats-io/nkeys/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-nats-io-nkeys-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
