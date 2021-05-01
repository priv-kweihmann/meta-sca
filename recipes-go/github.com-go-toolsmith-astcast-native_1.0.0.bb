SUMMARY = "go.mod: github.com/go-toolsmith/astcast"
HOMEPAGE = "https://pkg.go.dev/github.com/go-toolsmith/astcast"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-toolsmith-astcast-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-toolsmith-strparse-native \
"

GO_IMPORT = "github.com/go-toolsmith/astcast"

inherit gosrc
inherit native
