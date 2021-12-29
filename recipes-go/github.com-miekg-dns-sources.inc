SRC_URI += "https://proxy.golang.org/github.com/miekg/dns/@v/v1.1.45.zip;srcoutput=github.com/miekg/dns;srcinput=github.com/miekg/dns@v1.1.45;downloadfilename=github-com-miekg-dns-1.1.45.zip;name=github-com-miekg-dns"
SRC_URI[github-com-miekg-dns.sha256sum] = "94a621c3644c83b9528c8e3265db9143d490bf9dd00e34d5021aa55ff93ae614"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/miekg/dns/LICENSE;md5=567c1ad6c08ca0ee8d7e0a0cf790aff9 \
"

GOSRC_INCLUDEGUARD += "github.com-miekg-dns-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
