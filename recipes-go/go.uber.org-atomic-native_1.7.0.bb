SUMMARY = "go.mod: go.uber.org/atomic"
HOMEPAGE = "https://pkg.go.dev/go.uber.org/atomic"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.uber.org-atomic-sources.inc

GO_IMPORT = "go.uber.org/atomic"

inherit gosrc
inherit native
