SRC_URI += "https://proxy.golang.org/github.com/securego/gosec/@v/v0.0.0-20200401082031-e946c8c39989.zip;srcoutput=github.com/securego/gosec;srcinput=github.com/securego/gosec@v0.0.0-20200401082031-e946c8c39989;downloadfilename=github-com-securego-gosec-0.0.0-20200401082031-e946c8c39989.zip;name=github-com-securego-gosec"
SRC_URI[github-com-securego-gosec.sha256sum] = "0a03c5d19a03b6e2f4d183233f228bfe56a23a216c6bac7b0382f50c85300436"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/securego/gosec/LICENSE.txt;md5=d3999b969cc50f5755737db7ce41ca2e \
"

GOSRC_INCLUDEGUARD += "github.com-securego-gosec-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mozilla-tls-observatory-sources.inc', '', 'github.com-mozilla-tls-observatory-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nbutton23-zxcvbn-go-sources.inc', '', 'github.com-nbutton23-zxcvbn-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
