SUMMARY = "go.mod: github.com/go-fonts/liberation"
HOMEPAGE = "https://pkg.go.dev/github.com/go-fonts/liberation"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-fonts-liberation-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-image-native \
"

GO_IMPORT = "github.com/go-fonts/liberation"

inherit gosrc
inherit native
