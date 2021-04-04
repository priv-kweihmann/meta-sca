SRC_URI += "https://proxy.golang.org/go.etcd.io/etcd/@v/v2.3.8+incompatible.zip;srcoutput=go.etcd.io/etcd;srcinput=go.etcd.io/etcd@v2.3.8+incompatible;downloadfilename=go-etcd-io-etcd-2.3.8+incompatible.zip;name=go-etcd-io-etcd"
SRC_URI[go-etcd-io-etcd.sha256sum] = "c09c0dd59e0dbd3b9348726d0275383b29af8012e8b4f2001c8f76d6bb231267"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/go.etcd.io/etcd/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "go.etcd.io-etcd-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-coreos-etcd-sources.inc', '', 'github.com-coreos-etcd-sources.inc', d)}
