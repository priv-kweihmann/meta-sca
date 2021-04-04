SUMMARY = "go.mod: github.com/codahale/hdrhistogram"
HOMEPAGE = "https://pkg.go.dev/github.com/codahale/hdrhistogram"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-codahale-hdrhistogram-sources.inc

GO_IMPORT = "github.com/codahale/hdrhistogram"

inherit gosrc
inherit native
