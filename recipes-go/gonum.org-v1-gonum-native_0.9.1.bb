SUMMARY = "go.mod: gonum.org/v1/gonum"
HOMEPAGE = "https://pkg.go.dev/gonum.org/v1/gonum"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gonum.org-v1-gonum-sources.inc

GO_IMPORT = "gonum.org/v1/gonum"

inherit gosrc
inherit native
