SUMMARY = "go.mod: github.com/jmespath/go-jmespath"
HOMEPAGE = "https://pkg.go.dev/github.com/jmespath/go-jmespath"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jmespath-go-jmespath-sources.inc

GO_IMPORT = "github.com/jmespath/go-jmespath"

inherit gosrc
inherit native
