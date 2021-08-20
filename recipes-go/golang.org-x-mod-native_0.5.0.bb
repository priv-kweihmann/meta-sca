SUMMARY = "go.mod: golang.org/x/mod"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/mod"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-mod-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-crypto-native \
    golang.org-x-xerrors-native \
"

GO_IMPORT = "golang.org/x/mod"

inherit gosrc
inherit native
