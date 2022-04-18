SRC_URI += "https://proxy.golang.org/go.etcd.io/etcd/client/pkg/v3/@v/v3.5.3.zip;srcoutput=go.etcd.io/etcd/client/pkg/v3;srcinput=go.etcd.io/etcd/client/pkg/v3@v3.5.3;downloadfilename=go-etcd-io-etcd-client-pkg-v3-3.5.3.zip;name=go-etcd-io-etcd-client-pkg-v3"
SRC_URI[go-etcd-io-etcd-client-pkg-v3.sha256sum] = "8ed0645022e19f5a8210a57e51cbbc4ff1ac395cdec69650c0260cc75578380f"

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
