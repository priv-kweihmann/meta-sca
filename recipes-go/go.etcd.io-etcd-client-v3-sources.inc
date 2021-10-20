SRC_URI += "https://proxy.golang.org/go.etcd.io/etcd/client/v3/@v/v3.5.1.zip;srcoutput=go.etcd.io/etcd/client/v3;srcinput=go.etcd.io/etcd/client/v3@v3.5.1;downloadfilename=go-etcd-io-etcd-client-v3-3.5.1.zip;name=go-etcd-io-etcd-client-v3"
SRC_URI[go-etcd-io-etcd-client-v3.sha256sum] = "0030486b7e05be610bcd3a3da0ae32929ad21c9cb9d9176f994c0295188d966f"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/go.etcd.io/etcd/client/v3/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "go.etcd.io-etcd-client-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-dustin-go-humanize-sources.inc', '', 'github.com-dustin-go-humanize-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-api-v3-sources.inc', '', 'go.etcd.io-etcd-api-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-client-pkg-v3-sources.inc', '', 'go.etcd.io-etcd-client-pkg-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-zap-sources.inc', '', 'go.uber.org-zap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'sigs.k8s.io-yaml-sources.inc', '', 'sigs.k8s.io-yaml-sources.inc', d)}
