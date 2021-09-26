SRC_URI += "https://proxy.golang.org/github.com/mattn/go-colorable/@v/v0.1.10.zip;srcoutput=github.com/mattn/go-colorable;srcinput=github.com/mattn/go-colorable@v0.1.10;downloadfilename=github-com-mattn-go-colorable-0.1.10.zip;name=github-com-mattn-go-colorable"
SRC_URI[github-com-mattn-go-colorable.sha256sum] = "30810ee2f9b5378be10807d33440724ac3b9010fc450d24ae68bdd4b3d25e5fc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-colorable/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-colorable-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
