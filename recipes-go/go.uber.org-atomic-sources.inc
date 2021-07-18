SRC_URI += "https://proxy.golang.org/go.uber.org/atomic/@v/v1.9.0.zip;srcoutput=go.uber.org/atomic;srcinput=go.uber.org/atomic@v1.9.0;downloadfilename=go-uber-org-atomic-1.9.0.zip;name=go-uber-org-atomic"
SRC_URI[go-uber-org-atomic.sha256sum] = "6a1b34a0510c5d0d09f141b3afcd40e6500a2005f5f36578e29b5fc6dc64c24a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/atomic/LICENSE.txt;md5=1caee86519456feda989f8a838102b50 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-atomic-sources.inc"

