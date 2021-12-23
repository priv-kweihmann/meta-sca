SUMMARY = "go.mod: github.com/golang/mock"
HOMEPAGE = "https://pkg.go.dev/github.com/golang/mock"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-golang-mock-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-mod-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/golang/mock"

inherit gosrc
inherit native
