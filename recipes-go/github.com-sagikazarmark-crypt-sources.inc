SRC_URI += "https://proxy.golang.org/github.com/sagikazarmark/crypt/@v/v0.9.0.zip;srcoutput=github.com/sagikazarmark/crypt;srcinput=github.com/sagikazarmark/crypt@v0.9.0;downloadfilename=github-com-sagikazarmark-crypt-0.9.0.zip;name=github-com-sagikazarmark-crypt"
SRC_URI[github-com-sagikazarmark-crypt.sha256sum] = "d30ef2dcd54fb28dd38817e58296bd82eae28fbfba74e33cc280f6b1d4a4e8de"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sagikazarmark/crypt/LICENSE;md5=351758e884debeafa2022e49cac2b154 \
"

GOSRC_INCLUDEGUARD += "github.com-sagikazarmark-crypt-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-firestore-sources.inc', '', 'cloud.google.com-go-firestore-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-consul-api-sources.inc', '', 'github.com-hashicorp-consul-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-api-v3-sources.inc', '', 'go.etcd.io-etcd-api-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-client-v2-sources.inc', '', 'go.etcd.io-etcd-client-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-client-v3-sources.inc', '', 'go.etcd.io-etcd-client-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
