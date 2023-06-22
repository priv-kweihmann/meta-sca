SRC_URI += "https://proxy.golang.org/github.com/miekg/dns/@v/v1.1.55.zip;srcoutput=github.com/miekg/dns;srcinput=github.com/miekg/dns@v1.1.55;downloadfilename=github-com-miekg-dns-1.1.55.zip;name=github-com-miekg-dns"
SRC_URI[github-com-miekg-dns.sha256sum] = "afe3fd68eb899aadf265b41fc7570a011cb67f6e596f07fa9d248846738186fb"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/miekg/dns/LICENSE;md5=b5215dfec2c591290f399a181669bef7 \
"

GOSRC_INCLUDEGUARD += "github.com-miekg-dns-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
