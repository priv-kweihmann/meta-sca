SRC_URI += "https://proxy.golang.org/github.com/tklauser/numcpus/@v/v0.4.0.zip;srcoutput=github.com/tklauser/numcpus;srcinput=github.com/tklauser/numcpus@v0.4.0;downloadfilename=github-com-tklauser-numcpus-0.4.0.zip;name=github-com-tklauser-numcpus"
SRC_URI[github-com-tklauser-numcpus.sha256sum] = "9719c3c848e98d337109bb065668e0c611502605402679a838a512107e694a5b"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/tklauser/numcpus/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-tklauser-numcpus-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
