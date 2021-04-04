SUMMARY = "go.mod: github.com/linkedin/goavro"
HOMEPAGE = "https://pkg.go.dev/github.com/linkedin/goavro"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-linkedin-goavro-sources.inc

GO_IMPORT = "github.com/linkedin/goavro"

inherit gosrc
inherit native
