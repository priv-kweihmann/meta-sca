SRC_URI += "https://github.com/PuerkitoBio/goquery/archive/refs/tags/v1.8.0.zip;srcoutput=github.com/PuerkitoBio/goquery;srcinput=goquery-1.8.0;downloadfilename=github-com-puerkitobio-goquery-1.8.0.zip;name=github-com-puerkitobio-goquery"
SRC_URI[github-com-puerkitobio-goquery.sha256sum] = "adfcb18459808f2c04e1790de24889799b3d060d78d9bbc6b600e23a64b620f4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/PuerkitoBio/goquery/LICENSE;md5=4ee9bef45920e3fbd01226d1224b8215 \
"

GOSRC_INCLUDEGUARD += "github.com-puerkitobio-goquery-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-andybalholm-cascadia-sources.inc', '', 'github.com-andybalholm-cascadia-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
