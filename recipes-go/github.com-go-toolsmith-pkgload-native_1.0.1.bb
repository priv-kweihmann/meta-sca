SUMMARY = "go.mod: github.com/go-toolsmith/pkgload"
HOMEPAGE = "https://pkg.go.dev/github.com/go-toolsmith/pkgload"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-toolsmith-pkgload-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/go-toolsmith/pkgload"

inherit gosrc
inherit native
