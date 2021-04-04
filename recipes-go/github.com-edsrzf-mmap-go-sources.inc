SRC_URI += "https://proxy.golang.org/github.com/edsrzf/mmap-go/@v/v1.0.0.zip;srcoutput=github.com/edsrzf/mmap-go;srcinput=github.com/edsrzf/mmap-go@v1.0.0;downloadfilename=github-com-edsrzf-mmap-go-1.0.0.zip;name=github-com-edsrzf-mmap-go"
SRC_URI[github-com-edsrzf-mmap-go.sha256sum] = "851a1d4d6e30f97ab23b7e4a6a7da9d1842f126d738f7386010c6ee7bf82518e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/edsrzf/mmap-go/LICENSE;md5=8c3f6072b212265c9f4b89a0c247b169 \
"

GOSRC_INCLUDEGUARD += "github.com-edsrzf-mmap-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
