SUMMARY = "go.mod: go.opencensus.io"
HOMEPAGE = "https://pkg.go.dev/go.opencensus.io"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.opencensus.io-sources.inc

GO_IMPORT = "go.opencensus.io"

inherit gosrc
inherit native
