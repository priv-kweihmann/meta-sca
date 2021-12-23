SUMMARY = "go.mod: github.com/urfave/negroni"
HOMEPAGE = "https://pkg.go.dev/github.com/urfave/negroni"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-urfave-negroni-sources.inc

GO_IMPORT = "github.com/urfave/negroni"

inherit gosrc
inherit native
