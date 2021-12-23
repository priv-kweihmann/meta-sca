SUMMARY = "go.mod: github.com/davecgh/go-spew"
HOMEPAGE = "https://pkg.go.dev/github.com/davecgh/go-spew"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-davecgh-go-spew-sources.inc

GO_IMPORT = "github.com/davecgh/go-spew"

inherit gosrc
inherit native
