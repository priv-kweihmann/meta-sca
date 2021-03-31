SUMMARY = "go.mod: github.com/apache/beam"
HOMEPAGE = "https://pkg.go.dev/github.com/apache/beam"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-apache-beam-sources.inc

GO_IMPORT = "github.com/apache/beam"

inherit gosrc
inherit native
