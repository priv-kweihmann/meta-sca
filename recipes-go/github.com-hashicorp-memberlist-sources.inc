SRC_URI += "https://proxy.golang.org/github.com/hashicorp/memberlist/@v/v0.3.1.zip;srcoutput=github.com/hashicorp/memberlist;srcinput=github.com/hashicorp/memberlist@v0.3.1;downloadfilename=github-com-hashicorp-memberlist-0.3.1.zip;name=github-com-hashicorp-memberlist"
SRC_URI[github-com-hashicorp-memberlist.sha256sum] = "767203787cd03cbc5cb076eb9680d27b7fd8c475bf696017a09297e559e30b18"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/memberlist/LICENSE;md5=b278a92d2c1509760384428817710378 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-memberlist-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-armon-go-metrics-sources.inc', '', 'github.com-armon-go-metrics-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-btree-sources.inc', '', 'github.com-google-btree-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-msgpack-sources.inc', '', 'github.com-hashicorp-go-msgpack-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-multierror-sources.inc', '', 'github.com-hashicorp-go-multierror-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-sockaddr-sources.inc', '', 'github.com-hashicorp-go-sockaddr-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-miekg-dns-sources.inc', '', 'github.com-miekg-dns-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sean--seed-sources.inc', '', 'github.com-sean--seed-sources.inc', d)}
