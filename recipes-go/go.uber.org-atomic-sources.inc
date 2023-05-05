SRC_URI += "https://proxy.golang.org/go.uber.org/atomic/@v/v1.11.0.zip;srcoutput=go.uber.org/atomic;srcinput=go.uber.org/atomic@v1.11.0;downloadfilename=go-uber-org-atomic-1.11.0.zip;name=go-uber-org-atomic"
SRC_URI[go-uber-org-atomic.sha256sum] = "8109325abe17488245878b07f3c35b10ba7d1aa3310f792968f5b9deba432e2c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/atomic/LICENSE.txt;md5=1caee86519456feda989f8a838102b50 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-atomic-sources.inc"

