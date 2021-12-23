SUMMARY = "go.mod: github.com/codegangsta/negroni"
HOMEPAGE = "https://pkg.go.dev/github.com/codegangsta/negroni"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-codegangsta-negroni-sources.inc

GO_IMPORT = "github.com/codegangsta/negroni"

inherit gosrc
inherit native
