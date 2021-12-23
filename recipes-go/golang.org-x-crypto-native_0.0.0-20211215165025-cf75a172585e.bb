SUMMARY = "go.mod: golang.org/x/crypto"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/crypto"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-crypto-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-net-native \
    golang.org-x-sys-native \
    golang.org-x-term-native \
"

GO_IMPORT = "golang.org/x/crypto"

inherit gosrc
inherit native
