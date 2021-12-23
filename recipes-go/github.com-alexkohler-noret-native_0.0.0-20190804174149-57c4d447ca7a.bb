SUMMARY = "go.mod: github.com/alexkohler/noret"
HOMEPAGE = "https://pkg.go.dev/github.com/alexkohler/noret"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-alexkohler-noret-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/alexkohler/noret"

inherit gosrc
inherit native
