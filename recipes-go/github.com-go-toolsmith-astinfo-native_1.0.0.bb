SUMMARY = "go.mod: github.com/go-toolsmith/astinfo"
HOMEPAGE = "https://pkg.go.dev/github.com/go-toolsmith/astinfo"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-toolsmith-astinfo-sources.inc

GO_IMPORT = "github.com/go-toolsmith/astinfo"

inherit gosrc
inherit native
