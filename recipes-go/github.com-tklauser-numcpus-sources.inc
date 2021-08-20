SRC_URI += "https://proxy.golang.org/github.com/tklauser/numcpus/@v/v0.3.0.zip;srcoutput=github.com/tklauser/numcpus;srcinput=github.com/tklauser/numcpus@v0.3.0;downloadfilename=github-com-tklauser-numcpus-0.3.0.zip;name=github-com-tklauser-numcpus"
SRC_URI[github-com-tklauser-numcpus.sha256sum] = "a5569abed62bb2d5f5f322f23fe8cae888fe98704442d59ed9e7aabfed423899"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/tklauser/numcpus/LICENSE;md5=b189efa39bf389ba2208c19332667298 \
"

GOSRC_INCLUDEGUARD += "github.com-tklauser-numcpus-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
