SUMMARY = "go.mod: github.com/fatih/camelcase"
HOMEPAGE = "https://pkg.go.dev/github.com/fatih/camelcase"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fatih-camelcase-sources.inc

GO_IMPORT = "github.com/fatih/camelcase"

inherit gosrc
inherit native
