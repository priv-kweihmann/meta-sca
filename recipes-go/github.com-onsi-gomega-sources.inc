SRC_URI += "https://proxy.golang.org/github.com/onsi/gomega/@v/v1.12.0.zip;srcoutput=github.com/onsi/gomega;srcinput=github.com/onsi/gomega@v1.12.0;downloadfilename=github-com-onsi-gomega-1.12.0.zip;name=github-com-onsi-gomega"
SRC_URI[github-com-onsi-gomega.sha256sum] = "80051ce1a3f4cb863a65462c91427c78ed8e25ee18bb9103f56c69fd81036446"

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
