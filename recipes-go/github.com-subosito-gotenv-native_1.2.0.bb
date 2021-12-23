SUMMARY = "go.mod: github.com/subosito/gotenv"
HOMEPAGE = "https://pkg.go.dev/github.com/subosito/gotenv"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-subosito-gotenv-sources.inc

GO_IMPORT = "github.com/subosito/gotenv"

inherit gosrc
inherit native
