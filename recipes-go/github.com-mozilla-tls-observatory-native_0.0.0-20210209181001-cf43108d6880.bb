SUMMARY = "go.mod: github.com/mozilla/tls-observatory"
HOMEPAGE = "https://pkg.go.dev/github.com/mozilla/tls-observatory"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mozilla-tls-observatory-sources.inc

EXTRA_DEPENDS += "\
    github.com-aws-aws-sdk-go-native \
    github.com-fatih-color-native \
    github.com-google-certificate-transparency-go-native \
    github.com-gorhill-cronexpr-native \
    github.com-gorilla-mux-native \
    github.com-gregjones-httpcache-native \
    github.com-hashicorp-golang-lru-native \
    github.com-lib-pq-native \
    github.com-miekg-dns-native \
    github.com-mozilla-scribe-native \
    github.com-sirupsen-logrus-native \
    github.com-viki-org-dnscache-native \
    github.com-yudai-gojsondiff-native \
    go.mozilla.org-mozlog-native \
    golang.org-x-crypto-native \
    gopkg.in-gcfg.v1-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/mozilla/tls-observatory"

inherit gosrc
inherit native
