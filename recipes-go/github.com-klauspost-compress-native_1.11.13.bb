SUMMARY = "go.mod: github.com/klauspost/compress"
HOMEPAGE = "https://pkg.go.dev/github.com/klauspost/compress"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-klauspost-compress-sources.inc

GO_IMPORT = "github.com/klauspost/compress"

inherit gosrc
inherit native
