SRC_URI += "https://proxy.golang.org/github.com/go-toolsmith/astequal/@v/v1.0.1.zip;srcoutput=github.com/go-toolsmith/astequal;srcinput=github.com/go-toolsmith/astequal@v1.0.1;downloadfilename=github-com-go-toolsmith-astequal-1.0.1.zip;name=github-com-go-toolsmith-astequal"
SRC_URI[github-com-go-toolsmith-astequal.sha256sum] = "dc44f26de7a9c3c9a92a122b6ed63885bf61fad56240cf3ab3b258173253f512"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-toolsmith/astequal/LICENSE;md5=e26595ff26ae26c9824da680cd12c1f5 \
"

GOSRC_INCLUDEGUARD += "github.com-go-toolsmith-astequal-sources.inc"

