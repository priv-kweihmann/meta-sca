SUMMARY = "go.mod: github.com/golang/snappy"
HOMEPAGE = "https://pkg.go.dev/github.com/golang/snappy"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-golang-snappy-sources.inc

GO_IMPORT = "github.com/golang/snappy"

inherit gosrc
inherit native
