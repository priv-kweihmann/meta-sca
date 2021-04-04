SRC_URI += "https://proxy.golang.org/github.com/leodido/go-urn/@v/v1.2.1.zip;srcoutput=github.com/leodido/go-urn;srcinput=github.com/leodido/go-urn@v1.2.1;downloadfilename=github-com-leodido-go-urn-1.2.1.zip;name=github-com-leodido-go-urn"
SRC_URI[github-com-leodido-go-urn.sha256sum] = "8ae6e756f0e919a551e447f286491c08ca36ceaf415c2dde395fd79c1a408d1a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/leodido/go-urn/LICENSE;md5=8f50db5538ec1148a9b3d14ed96c3418 \
"

GOSRC_INCLUDEGUARD += "github.com-leodido-go-urn-sources.inc"

