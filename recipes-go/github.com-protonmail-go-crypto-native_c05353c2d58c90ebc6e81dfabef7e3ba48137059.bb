SUMMARY = "go.mod: github.com/ProtonMail/go-crypto"
HOMEPAGE = "https://pkg.go.dev/github.com/ProtonMail/go-crypto"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-protonmail-go-crypto-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-crypto-native \
"

GO_IMPORT = "github.com/ProtonMail/go-crypto"

UPSTREAM_CHECK_COMMITS = "1"

inherit gosrc
inherit native
