SRC_URI += "https://proxy.golang.org/go.etcd.io/etcd/client/v2/@v/v2.305.2.zip;srcoutput=go.etcd.io/etcd/client/v2;srcinput=go.etcd.io/etcd/client/v2@v2.305.2;downloadfilename=go-etcd-io-etcd-client-v2-2.305.2.zip;name=go-etcd-io-etcd-client-v2"
SRC_URI[go-etcd-io-etcd-client-v2.sha256sum] = "25e0a2e179114cdc122e57dcee974cff927cbe2f04304d71575fe0dbf66d506b"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/go.etcd.io/etcd/client/v2/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "go.etcd.io-etcd-client-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-json-iterator-go-sources.inc', '', 'github.com-json-iterator-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-modern-go-reflect2-sources.inc', '', 'github.com-modern-go-reflect2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-client-v3-sources.inc', '', 'go.etcd.io-etcd-client-v3-sources.inc', d)}
