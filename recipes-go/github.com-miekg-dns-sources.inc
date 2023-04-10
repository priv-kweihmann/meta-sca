SRC_URI += "https://proxy.golang.org/github.com/miekg/dns/@v/v1.1.53.zip;srcoutput=github.com/miekg/dns;srcinput=github.com/miekg/dns@v1.1.53;downloadfilename=github-com-miekg-dns-1.1.53.zip;name=github-com-miekg-dns"
SRC_URI[github-com-miekg-dns.sha256sum] = "bca870a4041ccc2afe140d64b3946ee24a60cd8fa2837a835f6daed1b3f99026"

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
