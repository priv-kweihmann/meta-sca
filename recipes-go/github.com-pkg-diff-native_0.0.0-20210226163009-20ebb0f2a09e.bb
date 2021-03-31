SUMMARY = "go.mod: github.com/pkg/diff"
HOMEPAGE = "https://pkg.go.dev/github.com/pkg/diff"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pkg-diff-sources.inc

GO_IMPORT = "github.com/pkg/diff"

inherit gosrc
inherit native
