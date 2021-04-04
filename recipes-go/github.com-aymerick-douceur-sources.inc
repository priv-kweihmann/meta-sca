SRC_URI += "https://proxy.golang.org/github.com/aymerick/douceur/@v/v0.2.0.zip;srcoutput=github.com/aymerick/douceur;srcinput=github.com/aymerick/douceur@v0.2.0;downloadfilename=github-com-aymerick-douceur-0.2.0.zip;name=github-com-aymerick-douceur"
SRC_URI[github-com-aymerick-douceur.sha256sum] = "dcbf69760cc1a8b32384495438e1086e4c3d669b2ebc0debd92e1865ffd6be60"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aymerick/douceur/LICENSE;md5=fd0cb84f618c94d44537f2cce7065bd4 \
"

GOSRC_INCLUDEGUARD += "github.com-aymerick-douceur-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-css-sources.inc', '', 'github.com-gorilla-css-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-puerkitobio-goquery-sources.inc', '', 'github.com-puerkitobio-goquery-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
