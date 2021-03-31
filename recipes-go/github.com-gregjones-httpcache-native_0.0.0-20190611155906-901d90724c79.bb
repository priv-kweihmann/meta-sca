SUMMARY = "go.mod: github.com/gregjones/httpcache"
HOMEPAGE = "https://pkg.go.dev/github.com/gregjones/httpcache"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gregjones-httpcache-sources.inc

GO_IMPORT = "github.com/gregjones/httpcache"

inherit gosrc
inherit native
