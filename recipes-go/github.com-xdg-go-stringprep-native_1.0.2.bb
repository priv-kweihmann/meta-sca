SUMMARY = "go.mod: github.com/xdg-go/stringprep"
HOMEPAGE = "https://pkg.go.dev/github.com/xdg-go/stringprep"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-xdg-go-stringprep-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-text-native \
"

GO_IMPORT = "github.com/xdg-go/stringprep"

inherit gosrc
inherit native
