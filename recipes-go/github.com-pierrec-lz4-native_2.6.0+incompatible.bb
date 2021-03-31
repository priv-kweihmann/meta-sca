SUMMARY = "go.mod: github.com/pierrec/lz4"
HOMEPAGE = "https://pkg.go.dev/github.com/pierrec/lz4"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pierrec-lz4-sources.inc

GO_IMPORT = "github.com/pierrec/lz4"

inherit gosrc
inherit native
