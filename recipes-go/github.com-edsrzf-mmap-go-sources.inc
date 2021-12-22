SRC_URI += "https://proxy.golang.org/github.com/edsrzf/mmap-go/@v/v1.1.0.zip;srcoutput=github.com/edsrzf/mmap-go;srcinput=github.com/edsrzf/mmap-go@v1.1.0;downloadfilename=github-com-edsrzf-mmap-go-1.1.0.zip;name=github-com-edsrzf-mmap-go"
SRC_URI[github-com-edsrzf-mmap-go.sha256sum] = "1c2fa2b55d253fb95d4b253ec39348deba3d46a184bc0a4393a355807b8e5df7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/edsrzf/mmap-go/LICENSE;md5=8c3f6072b212265c9f4b89a0c247b169 \
"

GOSRC_INCLUDEGUARD += "github.com-edsrzf-mmap-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
