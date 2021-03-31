SUMMARY = "go.mod: github.com/viki-org/dnscache"
HOMEPAGE = "https://pkg.go.dev/github.com/viki-org/dnscache"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-viki-org-dnscache-sources.inc

GO_IMPORT = "github.com/viki-org/dnscache"

inherit gosrc
inherit native
