SRC_URI += "https://proxy.golang.org/github.com/chris-ramon/douceur/@v/v0.2.0.zip;srcoutput=github.com/chris-ramon/douceur;srcinput=github.com/chris-ramon/douceur@v0.2.0;downloadfilename=github-com-chris-ramon-douceur-0.2.0.zip;name=github-com-chris-ramon-douceur"
SRC_URI[github-com-chris-ramon-douceur.sha256sum] = "60081aac26e821f58b5202a345080c70ba4844892165d9f1ae118c2cac9144be"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chris-ramon/douceur/LICENSE;md5=fd0cb84f618c94d44537f2cce7065bd4 \
"

GOSRC_INCLUDEGUARD += "github.com-chris-ramon-douceur-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aymerick-douceur-sources.inc', '', 'github.com-aymerick-douceur-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-css-sources.inc', '', 'github.com-gorilla-css-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-puerkitobio-goquery-sources.inc', '', 'github.com-puerkitobio-goquery-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
