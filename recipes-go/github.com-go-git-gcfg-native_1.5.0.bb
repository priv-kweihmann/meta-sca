SUMMARY = "go.mod: github.com/go-git/gcfg"
HOMEPAGE = "https://pkg.go.dev/github.com/go-git/gcfg"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-git-gcfg-sources.inc

EXTRA_DEPENDS += "\
    gopkg.in-warnings.v0-native \
"

GO_IMPORT = "github.com/go-git/gcfg"

inherit gosrc
inherit native
