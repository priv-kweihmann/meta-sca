SUMMARY = "go.mod: github.com/antihax/optional"
HOMEPAGE = "https://pkg.go.dev/github.com/antihax/optional"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-antihax-optional-sources.inc

GO_IMPORT = "github.com/antihax/optional"

inherit gosrc
inherit native
