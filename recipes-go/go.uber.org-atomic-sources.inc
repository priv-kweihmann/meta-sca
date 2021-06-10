SRC_URI += "https://proxy.golang.org/go.uber.org/atomic/@v/v1.8.0.zip;srcoutput=go.uber.org/atomic;srcinput=go.uber.org/atomic@v1.8.0;downloadfilename=go-uber-org-atomic-1.8.0.zip;name=go-uber-org-atomic"
SRC_URI[go-uber-org-atomic.sha256sum] = "5e3dd9c7fdf7cd5e08d95ddf793e7e21b909aa4720d2dd96fc67ed3e5bb4358b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/atomic/LICENSE.txt;md5=1caee86519456feda989f8a838102b50 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-atomic-sources.inc"

