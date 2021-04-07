SRC_URI += "https://proxy.golang.org/github.com/go-toolsmith/astequal/@v/v1.0.0.zip;srcoutput=github.com/go-toolsmith/astequal;srcinput=github.com/go-toolsmith/astequal@v1.0.0;downloadfilename=github-com-go-toolsmith-astequal-1.0.0.zip;name=github-com-go-toolsmith-astequal"
SRC_URI[github-com-go-toolsmith-astequal.sha256sum] = "27a4a5e202ca18362425987c9ac37d3729549b5818ffdd3dde26ffb715df96a1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-toolsmith/astequal/LICENSE;md5=e26595ff26ae26c9824da680cd12c1f5 \
"

GOSRC_INCLUDEGUARD += "github.com-go-toolsmith-astequal-sources.inc"

