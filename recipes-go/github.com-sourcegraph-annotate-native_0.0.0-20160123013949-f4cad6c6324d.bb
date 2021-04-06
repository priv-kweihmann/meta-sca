SUMMARY = "go.mod: github.com/sourcegraph/annotate"
HOMEPAGE = "https://pkg.go.dev/github.com/sourcegraph/annotate"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sourcegraph-annotate-sources.inc

GO_IMPORT = "github.com/sourcegraph/annotate"

inherit gosrc
inherit native
