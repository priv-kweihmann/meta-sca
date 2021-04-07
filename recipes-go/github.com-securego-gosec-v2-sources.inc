SRC_URI += "https://proxy.golang.org/github.com/securego/gosec/v2/@v/v2.7.0.zip;srcoutput=github.com/securego/gosec/v2;srcinput=github.com/securego/gosec/v2@v2.7.0;downloadfilename=github-com-securego-gosec-v2-2.7.0.zip;name=github-com-securego-gosec-v2"
SRC_URI[github-com-securego-gosec-v2.sha256sum] = "b8815f723342827378ebf6aac9b7788b4a746febcf5b51567e663821bcfffa1b"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/securego/gosec/v2/LICENSE.txt;md5=d3999b969cc50f5755737db7ce41ca2e \
"

GOSRC_INCLUDEGUARD += "github.com-securego-gosec-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gookit-color-sources.inc', '', 'github.com-gookit-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mozilla-tls-observatory-sources.inc', '', 'github.com-mozilla-tls-observatory-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nbutton23-zxcvbn-go-sources.inc', '', 'github.com-nbutton23-zxcvbn-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
