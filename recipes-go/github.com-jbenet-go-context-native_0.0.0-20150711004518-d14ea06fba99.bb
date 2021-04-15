SUMMARY = "go.mod: github.com/jbenet/go-context"
HOMEPAGE = "https://pkg.go.dev/github.com/jbenet/go-context"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jbenet-go-context-sources.inc

GO_IMPORT = "github.com/jbenet/go-context"

inherit gosrc
inherit native
