SUMMARY = "go.mod: github.com/jsummers/gobmp"
HOMEPAGE = "https://pkg.go.dev/github.com/jsummers/gobmp"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jsummers-gobmp-sources.inc

GO_IMPORT = "github.com/jsummers/gobmp"

inherit gosrc
inherit native
