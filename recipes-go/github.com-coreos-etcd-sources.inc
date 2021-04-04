SRC_URI += "https://proxy.golang.org/github.com/coreos/etcd/@v/v2.3.8+incompatible.zip;srcoutput=github.com/coreos/etcd;srcinput=github.com/coreos/etcd@v2.3.8+incompatible;downloadfilename=github-com-coreos-etcd-2.3.8+incompatible.zip;name=github-com-coreos-etcd"
SRC_URI[github-com-coreos-etcd.sha256sum] = "955be668a653b32c690e1f73b49064b14ae3adb6410c3ca85f7d42ab767eae87"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/coreos/etcd/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-coreos-etcd-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-olekukonko-tablewriter-sources.inc', '', 'github.com-olekukonko-tablewriter-sources.inc', d)}
