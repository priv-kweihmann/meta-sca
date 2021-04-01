SUMMARY = "go.mod: github.com/mitchellh/go-testing-interface"
HOMEPAGE = "https://pkg.go.dev/github.com/mitchellh/go-testing-interface"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mitchellh-go-testing-interface-sources.inc

GO_IMPORT = "github.com/mitchellh/go-testing-interface"

inherit gosrc
inherit native
