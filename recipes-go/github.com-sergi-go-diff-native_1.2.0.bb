SUMMARY = "go.mod: github.com/sergi/go-diff"
HOMEPAGE = "https://pkg.go.dev/github.com/sergi/go-diff"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sergi-go-diff-sources.inc

GO_IMPORT = "github.com/sergi/go-diff"

inherit gosrc
inherit native
