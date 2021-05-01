SUMMARY = "go.mod: github.com/securego/gosec/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/securego/gosec/v2"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-securego-gosec-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-gookit-color-native \
    github.com-lib-pq-native \
    github.com-mozilla-tls-observatory-native \
    github.com-nbutton23-zxcvbn-go-native \
    golang.org-x-crypto-native \
    golang.org-x-tools-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/securego/gosec/v2"

inherit gosrc
inherit native
