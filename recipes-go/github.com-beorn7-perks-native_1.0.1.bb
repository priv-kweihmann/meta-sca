SUMMARY = "go.mod: github.com/beorn7/perks"
HOMEPAGE = "https://pkg.go.dev/github.com/beorn7/perks"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-beorn7-perks-sources.inc

GO_IMPORT = "github.com/beorn7/perks"

inherit gosrc
inherit native
