SUMMARY = "go.mod: github.com/alexkohler/identypo"
HOMEPAGE = "https://pkg.go.dev/github.com/alexkohler/identypo"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-alexkohler-identypo-sources.inc
require github.com-client9-misspell-sources.inc
require github.com-fatih-camelcase-sources.inc

GO_IMPORT = "github.com/alexkohler/identypo"

inherit gosrc
inherit native
