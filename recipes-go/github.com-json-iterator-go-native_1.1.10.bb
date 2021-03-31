SUMMARY = "go.mod: github.com/json-iterator/go"
HOMEPAGE = "https://pkg.go.dev/github.com/json-iterator/go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-json-iterator-go-sources.inc
require github.com-modern-go-concurrent-sources.inc
require github.com-modern-go-reflect2-sources.inc

GO_IMPORT = "github.com/json-iterator/go"

inherit gosrc
inherit native
