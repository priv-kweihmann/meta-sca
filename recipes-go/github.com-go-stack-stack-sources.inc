SRC_URI += "https://proxy.golang.org/github.com/go-stack/stack/@v/v1.8.1.zip;srcoutput=github.com/go-stack/stack;srcinput=github.com/go-stack/stack@v1.8.1;downloadfilename=github-com-go-stack-stack-1.8.1.zip;name=github-com-go-stack-stack"
SRC_URI[github-com-go-stack-stack.sha256sum] = "944a204de02272c5718a6819f1f4f6d433a0ef50ca9e737154fceae742694477"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-stack/stack/LICENSE.md;md5=55d1e6f86c872bf9b8f648d1293cb2c3 \
"

GOSRC_INCLUDEGUARD += "github.com-go-stack-stack-sources.inc"

