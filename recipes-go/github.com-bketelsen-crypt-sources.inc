SRC_URI += "https://proxy.golang.org/github.com/bketelsen/crypt/@v/v0.0.3.zip;srcoutput=github.com/bketelsen/crypt;srcinput=github.com/bketelsen/crypt@v0.0.3;downloadfilename=github-com-bketelsen-crypt-0.0.3.zip;name=github-com-bketelsen-crypt"
SRC_URI[github-com-bketelsen-crypt.sha256sum] = "08c411055e8cd30ddc11002c5078ed7a1bfd68c801a89fee218695a0adbe5e68"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/bketelsen/crypt/LICENSE;md5=351758e884debeafa2022e49cac2b154 \
"

GOSRC_INCLUDEGUARD += "github.com-bketelsen-crypt-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-firestore-sources.inc', '', 'cloud.google.com-go-firestore-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-coreos-etcd-sources.inc', '', 'github.com-coreos-etcd-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-consul-api-sources.inc', '', 'github.com-hashicorp-consul-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
