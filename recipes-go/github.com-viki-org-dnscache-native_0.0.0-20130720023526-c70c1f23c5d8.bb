SUMMARY = "go.mod: github.com/viki-org/dnscache"
HOMEPAGE = "https://pkg.go.dev/github.com/viki-org/dnscache"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-viki-org-dnscache-sources.inc

GO_IMPORT = "github.com/viki-org/dnscache"

inherit gosrc
inherit native
