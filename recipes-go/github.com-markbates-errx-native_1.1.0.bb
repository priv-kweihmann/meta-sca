SUMMARY = "go.mod: github.com/markbates/errx"
HOMEPAGE = "https://pkg.go.dev/github.com/markbates/errx"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-markbates-errx-sources.inc

GO_IMPORT = "github.com/markbates/errx"

inherit gosrc
inherit native
