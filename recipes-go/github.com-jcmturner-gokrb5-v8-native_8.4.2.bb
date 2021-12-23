SUMMARY = "go.mod: github.com/jcmturner/gokrb5/v8"
HOMEPAGE = "https://pkg.go.dev/github.com/jcmturner/gokrb5/v8"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jcmturner-gokrb5-v8-sources.inc

EXTRA_DEPENDS += "\
    github.com-gorilla-sessions-native \
    github.com-hashicorp-go-uuid-native \
    github.com-jcmturner-aescts-v2-native \
    github.com-jcmturner-dnsutils-v2-native \
    github.com-jcmturner-gofork-native \
    github.com-jcmturner-goidentity-v6-native \
    github.com-jcmturner-rpc-v2-native \
    golang.org-x-crypto-native \
"

GO_IMPORT = "github.com/jcmturner/gokrb5/v8"

inherit gosrc
inherit native
