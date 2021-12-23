SUMMARY = "go.mod: gopkg.in/warnings.v0"
HOMEPAGE = "https://pkg.go.dev/gopkg.in/warnings.v0"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gopkg.in-warnings.v0-sources.inc

GO_IMPORT = "gopkg.in/warnings.v0"

inherit gosrc
inherit native
