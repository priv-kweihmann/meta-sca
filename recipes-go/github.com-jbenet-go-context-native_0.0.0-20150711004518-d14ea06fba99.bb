SUMMARY = "go.mod: github.com/jbenet/go-context"
HOMEPAGE = "https://pkg.go.dev/github.com/jbenet/go-context"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jbenet-go-context-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-net-native \
"

GO_IMPORT = "github.com/jbenet/go-context"

inherit gosrc
inherit native
