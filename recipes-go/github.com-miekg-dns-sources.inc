SRC_URI += "https://proxy.golang.org/github.com/miekg/dns/@v/v1.1.54.zip;srcoutput=github.com/miekg/dns;srcinput=github.com/miekg/dns@v1.1.54;downloadfilename=github-com-miekg-dns-1.1.54.zip;name=github-com-miekg-dns"
SRC_URI[github-com-miekg-dns.sha256sum] = "2b675e684740a64bea116f43c8c51b877664f5df25f6b0479be6b875e8f9387d"

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
