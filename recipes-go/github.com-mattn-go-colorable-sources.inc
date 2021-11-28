SRC_URI += "https://proxy.golang.org/github.com/mattn/go-colorable/@v/v0.1.12.zip;srcoutput=github.com/mattn/go-colorable;srcinput=github.com/mattn/go-colorable@v0.1.12;downloadfilename=github-com-mattn-go-colorable-0.1.12.zip;name=github-com-mattn-go-colorable"
SRC_URI[github-com-mattn-go-colorable.sha256sum] = "c4637499409a4081fbbd7ea0640aa0af30c0e06a70aa1b207780b0251650d8cd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-colorable/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-colorable-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
