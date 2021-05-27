SRC_URI += "https://proxy.golang.org/github.com/onsi/gomega/@v/v1.13.0.zip;srcoutput=github.com/onsi/gomega;srcinput=github.com/onsi/gomega@v1.13.0;downloadfilename=github-com-onsi-gomega-1.13.0.zip;name=github-com-onsi-gomega"
SRC_URI[github-com-onsi-gomega.sha256sum] = "fb5e97717250320cf5bd383dc08dec6801993997c883766781942a66a17a9942"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/onsi/gomega/LICENSE;md5=570603114d52313cb86c0206401c9af7 \
"

GOSRC_INCLUDEGUARD += "github.com-onsi-gomega-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
