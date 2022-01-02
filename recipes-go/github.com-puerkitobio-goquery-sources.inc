SRC_URI += "git://github.com/PuerkitoBio/goquery;nobranch=1;protocol=https;srcinput=github.com/PuerkitoBio/goquery;srcoutput=github.com/PuerkitoBio/goquery;destsuffix=github.com/PuerkitoBio/goquery;name=github-com-puerkitobio-goquery"
SRCREV_github-com-puerkitobio-goquery = "a8c788f298a276f1212549ea615619a7e133a84f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/PuerkitoBio/goquery/LICENSE;md5=4ee9bef45920e3fbd01226d1224b8215 \
"

GOSRC_INCLUDEGUARD += "github.com-puerkitobio-goquery-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-andybalholm-cascadia-sources.inc', '', 'github.com-andybalholm-cascadia-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
