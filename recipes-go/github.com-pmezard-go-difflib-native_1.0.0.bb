SUMMARY = "go.mod: github.com/pmezard/go-difflib"
HOMEPAGE = "https://pkg.go.dev/github.com/pmezard/go-difflib"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pmezard-go-difflib-sources.inc

GO_IMPORT = "github.com/pmezard/go-difflib"

inherit gosrc
inherit native
