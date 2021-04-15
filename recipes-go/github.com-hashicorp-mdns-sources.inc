SRC_URI += "https://proxy.golang.org/github.com/hashicorp/mdns/@v/v1.0.4.zip;srcoutput=github.com/hashicorp/mdns;srcinput=github.com/hashicorp/mdns@v1.0.4;downloadfilename=github-com-hashicorp-mdns-1.0.4.zip;name=github-com-hashicorp-mdns"
SRC_URI[github-com-hashicorp-mdns.sha256sum] = "f7d04f484c5b398018385ad954a922b0d94d0cb26315780bf995bedede166704"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/mdns/LICENSE;md5=cb04212e101fbbd028f325e04ad45778 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-mdns-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-miekg-dns-sources.inc', '', 'github.com-miekg-dns-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
