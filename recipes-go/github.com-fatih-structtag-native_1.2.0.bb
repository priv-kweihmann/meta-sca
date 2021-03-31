SUMMARY = "go.mod: github.com/fatih/structtag"
HOMEPAGE = "https://pkg.go.dev/github.com/fatih/structtag"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fatih-structtag-sources.inc

GO_IMPORT = "github.com/fatih/structtag"

inherit gosrc
inherit native
