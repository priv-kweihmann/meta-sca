SUMMARY = "go.mod: sourcegraph.com/sourcegraph/appdash"
HOMEPAGE = "https://pkg.go.dev/sourcegraph.com/sourcegraph/appdash"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require sourcegraph.com-sourcegraph-appdash-sources.inc

GO_IMPORT = "sourcegraph.com/sourcegraph/appdash"

inherit gosrc
inherit native
