SRC_URI += "https://proxy.golang.org/github.com/miekg/dns/@v/v1.1.42.zip;srcoutput=github.com/miekg/dns;srcinput=github.com/miekg/dns@v1.1.42;downloadfilename=github-com-miekg-dns-1.1.42.zip;name=github-com-miekg-dns"
SRC_URI[github-com-miekg-dns.sha256sum] = "c722c3162340873879be4db866caeb46dc752854a57c7007350fdfc5c350bdfe"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/miekg/dns/LICENSE;md5=567c1ad6c08ca0ee8d7e0a0cf790aff9 \
"

GOSRC_INCLUDEGUARD += "github.com-miekg-dns-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
