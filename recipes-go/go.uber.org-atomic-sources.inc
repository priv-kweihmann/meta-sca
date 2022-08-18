SRC_URI += "https://proxy.golang.org/go.uber.org/atomic/@v/v1.10.0.zip;srcoutput=go.uber.org/atomic;srcinput=go.uber.org/atomic@v1.10.0;downloadfilename=go-uber-org-atomic-1.10.0.zip;name=go-uber-org-atomic"
SRC_URI[go-uber-org-atomic.sha256sum] = "1a3a7303a5d7372db8184404b09f3142bf206e3a0001be468be2fc2540893d7a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/go.uber.org/atomic/LICENSE.txt;md5=1caee86519456feda989f8a838102b50 \
"

GOSRC_INCLUDEGUARD += "go.uber.org-atomic-sources.inc"

