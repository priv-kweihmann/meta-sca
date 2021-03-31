SRC_URI_append = " https://proxy.golang.org/go.uber.org/atomic/@v/v1.7.0.zip;srcoutput=go.uber.org/atomic;srcinput=go.uber.org/atomic@v1.7.0;downloadfilename=go-uber-org-atomic-1.7.0.zip;name=go-uber-org-atomic"
SRC_URI[go-uber-org-atomic.sha256sum] = "0417b4203eb1454a0eeda59e79f426c27fcfb9e3c74077060303429cc16db307"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/go.uber.org/atomic/LICENSE.txt;md5=1caee86519456feda989f8a838102b50 \
"
