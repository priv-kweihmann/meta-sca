SUMMARY = "go.mod: github.com/circonus-labs/circonus-gometrics"
HOMEPAGE = "https://pkg.go.dev/github.com/circonus-labs/circonus-gometrics"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-circonus-labs-circonus-gometrics-sources.inc

GO_IMPORT = "github.com/circonus-labs/circonus-gometrics"

inherit gosrc
inherit native
