SRC_URI += "https://proxy.golang.org/github.com/alexkohler/identypo/@v/v0.0.0-20180915162145-dcb8a7984045.zip;srcoutput=github.com/alexkohler/identypo;srcinput=github.com/alexkohler/identypo@v0.0.0-20180915162145-dcb8a7984045;downloadfilename=github-com-alexkohler-identypo-0.0.0-20180915162145-dcb8a7984045.zip;name=github-com-alexkohler-identypo"
SRC_URI[github-com-alexkohler-identypo.sha256sum] = "4cd1e5eace0bde3d318e1bfd300a65d6326bcec1579fd28d3f6853df68b3761e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alexkohler/identypo/LICENSE;md5=55bfb4256a903d5c2d6be3e909894bef \
"

GOSRC_INCLUDEGUARD += "github.com-alexkohler-identypo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-client9-misspell-sources.inc', '', 'github.com-client9-misspell-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-camelcase-sources.inc', '', 'github.com-fatih-camelcase-sources.inc', d)}
