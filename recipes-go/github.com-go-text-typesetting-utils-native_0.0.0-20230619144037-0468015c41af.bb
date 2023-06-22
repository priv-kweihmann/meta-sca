SUMMARY = "go.mod: github.com/go-text/typesetting-utils"
HOMEPAGE = "https://pkg.go.dev/github.com/go-text/typesetting-utils"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-text-typesetting-utils-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-net-native \
    golang.org-x-text-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/go-text/typesetting-utils"

inherit gosrc
inherit native
