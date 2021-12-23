SUMMARY = "go.mod: github.com/go-chi/chi"
HOMEPAGE = "https://pkg.go.dev/github.com/go-chi/chi"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-chi-chi-sources.inc

GO_IMPORT = "github.com/go-chi/chi"

inherit gosrc
inherit native
