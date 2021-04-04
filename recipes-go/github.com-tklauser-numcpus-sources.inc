SRC_URI += "https://proxy.golang.org/github.com/tklauser/numcpus/@v/v0.2.2.zip;srcoutput=github.com/tklauser/numcpus;srcinput=github.com/tklauser/numcpus@v0.2.2;downloadfilename=github-com-tklauser-numcpus-0.2.2.zip;name=github-com-tklauser-numcpus"
SRC_URI[github-com-tklauser-numcpus.sha256sum] = "ec54ba2e9891c0f0e91fcc336a958e4dce38d33652d2fc77a21962be30bd6cae"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/tklauser/numcpus/LICENSE;md5=b189efa39bf389ba2208c19332667298 \
"

GOSRC_INCLUDEGUARD += "github.com-tklauser-numcpus-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
