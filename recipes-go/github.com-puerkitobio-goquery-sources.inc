SRC_URI += "https://github.com/PuerkitoBio/goquery/archive/refs/tags/v1.7.1.zip;srcoutput=github.com/PuerkitoBio/goquery;srcinput=goquery-1.7.1;downloadfilename=github-com-puerkitobio-goquery-1.7.1.zip;name=github-com-puerkitobio-goquery"
SRC_URI[github-com-puerkitobio-goquery.sha256sum] = "6e12fa2e15141f2ddc611de46d883c33eedea9b28fc6d55ac869743f71426ba8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/PuerkitoBio/goquery/LICENSE;md5=4ee9bef45920e3fbd01226d1224b8215 \
"

GOSRC_INCLUDEGUARD += "github.com-puerkitobio-goquery-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-andybalholm-cascadia-sources.inc', '', 'github.com-andybalholm-cascadia-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
