SRC_URI += "https://proxy.golang.org/go.etcd.io/etcd/api/v3/@v/v3.5.1.zip;srcoutput=go.etcd.io/etcd/api/v3;srcinput=go.etcd.io/etcd/api/v3@v3.5.1;downloadfilename=go-etcd-io-etcd-api-v3-3.5.1.zip;name=go-etcd-io-etcd-api-v3"
SRC_URI[go-etcd-io-etcd-api-v3.sha256sum] = "79f02536eb870df33cdad1269dce724cb5e61b26dfe8a0c0bd539fad91201c3c"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/go.etcd.io/etcd/api/v3/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "go.etcd.io-etcd-api-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-coreos-go-semver-sources.inc', '', 'github.com-coreos-go-semver-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gogo-protobuf-sources.inc', '', 'github.com-gogo-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-grpc-ecosystem-grpc-gateway-sources.inc', '', 'github.com-grpc-ecosystem-grpc-gateway-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
