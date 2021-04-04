SRC_URI += "https://github.com/PuerkitoBio/goquery/archive/refs/tags/v1.6.1.zip;srcoutput=github.com/PuerkitoBio/goquery;srcinput=goquery-1.6.1;downloadfilename=github-com-puerkitobio-goquery-1.6.1.zip;name=github-com-puerkitobio-goquery"
SRC_URI[github-com-puerkitobio-goquery.sha256sum] = "5532fbdf7e4a94eaadd2c1712e84bea9b90c221609a82ac4fd591102f21997bf"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/PuerkitoBio/goquery/LICENSE;md5=921c8eaa8c0e7ef0742e20217c6d01ab \
"

GOSRC_INCLUDEGUARD += "github.com-puerkitobio-goquery-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-andybalholm-cascadia-sources.inc', '', 'github.com-andybalholm-cascadia-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
