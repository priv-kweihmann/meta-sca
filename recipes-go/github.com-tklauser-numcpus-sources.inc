SRC_URI += "https://proxy.golang.org/github.com/tklauser/numcpus/@v/v0.2.3.zip;srcoutput=github.com/tklauser/numcpus;srcinput=github.com/tklauser/numcpus@v0.2.3;downloadfilename=github-com-tklauser-numcpus-0.2.3.zip;name=github-com-tklauser-numcpus"
SRC_URI[github-com-tklauser-numcpus.sha256sum] = "c0d0702a4178c06c0fbf4fec747ce205244ce32a302ca39282a91e70260b8772"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/tklauser/numcpus/LICENSE;md5=b189efa39bf389ba2208c19332667298 \
"

GOSRC_INCLUDEGUARD += "github.com-tklauser-numcpus-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
