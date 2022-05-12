SRC_URI += "https://proxy.golang.org/github.com/miekg/dns/@v/v1.1.49.zip;srcoutput=github.com/miekg/dns;srcinput=github.com/miekg/dns@v1.1.49;downloadfilename=github-com-miekg-dns-1.1.49.zip;name=github-com-miekg-dns"
SRC_URI[github-com-miekg-dns.sha256sum] = "9f5ab18e08741e8c36a815fa1a83d8d549863a0fc106f484a46ed07e01e6ae93"

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
