SRC_URI += "https://proxy.golang.org/github.com/miekg/dns/@v/v1.1.43.zip;srcoutput=github.com/miekg/dns;srcinput=github.com/miekg/dns@v1.1.43;downloadfilename=github-com-miekg-dns-1.1.43.zip;name=github-com-miekg-dns"
SRC_URI[github-com-miekg-dns.sha256sum] = "98eaddff5c30e475850f8f9c170bfb1adf33f0aaeeb280f71e77808a1dd902aa"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/miekg/dns/LICENSE;md5=567c1ad6c08ca0ee8d7e0a0cf790aff9 \
"

GOSRC_INCLUDEGUARD += "github.com-miekg-dns-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
