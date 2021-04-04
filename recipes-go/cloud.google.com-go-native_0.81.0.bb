SUMMARY = "go.mod: cloud.google.com/go"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-sources.inc

GO_IMPORT = "cloud.google.com/go"

inherit gosrc
inherit native
