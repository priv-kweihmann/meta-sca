SUMMARY = "go.mod: github.com/cespare/xxhash"
HOMEPAGE = "https://pkg.go.dev/github.com/cespare/xxhash"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-cespare-xxhash-sources.inc

GO_IMPORT = "github.com/cespare/xxhash"

inherit gosrc
inherit native
