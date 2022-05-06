SRC_URI += "https://proxy.golang.org/github.com/monoculum/formam/@v/v2.1.0+incompatible.zip;srcoutput=github.com/monoculum/formam;srcinput=github.com/monoculum/formam@v2.1.0+incompatible;downloadfilename=github-com-monoculum-formam-2.1.0+incompatible.zip;name=github-com-monoculum-formam"
SRC_URI[github-com-monoculum-formam.sha256sum] = "2aa0add4722ecba345c5e4e97f7165df493d876fb38f977130f2d9023965edb3"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/monoculum/formam/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \
"

GOSRC_INCLUDEGUARD += "github.com-monoculum-formam-sources.inc"

