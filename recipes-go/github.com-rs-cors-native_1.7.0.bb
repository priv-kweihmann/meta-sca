SUMMARY = "go.mod: github.com/rs/cors"
HOMEPAGE = "https://pkg.go.dev/github.com/rs/cors"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rs-cors-sources.inc

GO_IMPORT = "github.com/rs/cors"

inherit gosrc
inherit native
