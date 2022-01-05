SRC_URI += "https://proxy.golang.org/github.com/hashicorp/mdns/@v/v1.0.5.zip;srcoutput=github.com/hashicorp/mdns;srcinput=github.com/hashicorp/mdns@v1.0.5;downloadfilename=github-com-hashicorp-mdns-1.0.5.zip;name=github-com-hashicorp-mdns"
SRC_URI[github-com-hashicorp-mdns.sha256sum] = "67b36444aa9d686fb5f1a2d72a100943da9d6887259fd3b2d4977445f57710dc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/mdns/LICENSE;md5=cb04212e101fbbd028f325e04ad45778 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-mdns-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-miekg-dns-sources.inc', '', 'github.com-miekg-dns-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
