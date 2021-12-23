SUMMARY = "go.mod: github.com/jcmturner/gofork"
HOMEPAGE = "https://pkg.go.dev/github.com/jcmturner/gofork"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jcmturner-gofork-sources.inc

GO_IMPORT = "github.com/jcmturner/gofork"

inherit gosrc
inherit native
