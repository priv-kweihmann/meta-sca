SUMMARY = "go.mod: github.com/alexkohler/identypo"
HOMEPAGE = "https://pkg.go.dev/github.com/alexkohler/identypo"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-alexkohler-identypo-sources.inc

EXTRA_DEPENDS += "\
    github.com-client9-misspell-native \
    github.com-fatih-camelcase-native \
"

GO_IMPORT = "github.com/alexkohler/identypo"

inherit gosrc
inherit native
