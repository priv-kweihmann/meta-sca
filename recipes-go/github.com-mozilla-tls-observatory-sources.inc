SRC_URI += "https://proxy.golang.org/github.com/mozilla/tls-observatory/@v/v0.0.0-20210209181001-cf43108d6880.zip;srcoutput=github.com/mozilla/tls-observatory;srcinput=github.com/mozilla/tls-observatory@v0.0.0-20210209181001-cf43108d6880;downloadfilename=github-com-mozilla-tls-observatory-0.0.0-20210209181001-cf43108d6880.zip;name=github-com-mozilla-tls-observatory"
SRC_URI[github-com-mozilla-tls-observatory.sha256sum] = "a3603a2de01eb79ff602ff464be418f224ff6b744bce64b3dfa8673cbf2287d2"
GOSRC_REMOVEDIRS += "github.com/mozilla/tls-observatory/tools"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mozilla/tls-observatory/LICENSE;md5=f27a50d2e878867827842f2c60e30bfc \
"

GOSRC_INCLUDEGUARD += "github.com-mozilla-tls-observatory-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-aws-sdk-go-sources.inc', '', 'github.com-aws-aws-sdk-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-certificate-transparency-go-sources.inc', '', 'github.com-google-certificate-transparency-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorhill-cronexpr-sources.inc', '', 'github.com-gorhill-cronexpr-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-mux-sources.inc', '', 'github.com-gorilla-mux-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gregjones-httpcache-sources.inc', '', 'github.com-gregjones-httpcache-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-golang-lru-sources.inc', '', 'github.com-hashicorp-golang-lru-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-miekg-dns-sources.inc', '', 'github.com-miekg-dns-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mozilla-scribe-sources.inc', '', 'github.com-mozilla-scribe-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-viki-org-dnscache-sources.inc', '', 'github.com-viki-org-dnscache-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yudai-gojsondiff-sources.inc', '', 'github.com-yudai-gojsondiff-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.mozilla.org-mozlog-sources.inc', '', 'go.mozilla.org-mozlog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-gcfg.v1-sources.inc', '', 'gopkg.in-gcfg.v1-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
