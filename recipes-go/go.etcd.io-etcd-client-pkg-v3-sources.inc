SRC_URI += "https://proxy.golang.org/go.etcd.io/etcd/client/pkg/v3/@v/v3.5.9.zip;srcoutput=go.etcd.io/etcd/client/pkg/v3;srcinput=go.etcd.io/etcd/client/pkg/v3@v3.5.9;downloadfilename=go-etcd-io-etcd-client-pkg-v3-3.5.9.zip;name=go-etcd-io-etcd-client-pkg-v3"
SRC_URI[go-etcd-io-etcd-client-pkg-v3.sha256sum] = "ec407a95ab4e631a7d883de6f9f99a7c8b81e1a5b723090b59805d7fc762901b"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/go.etcd.io/etcd/client/pkg/v3/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "go.etcd.io-etcd-client-pkg-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-coreos-go-systemd-v22-sources.inc', '', 'github.com-coreos-go-systemd-v22-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-zap-sources.inc', '', 'go.uber.org-zap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
