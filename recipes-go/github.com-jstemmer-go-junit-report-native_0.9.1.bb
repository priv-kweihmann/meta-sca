SUMMARY = "go.mod: github.com/jstemmer/go-junit-report"
HOMEPAGE = "https://pkg.go.dev/github.com/jstemmer/go-junit-report"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jstemmer-go-junit-report-sources.inc

GO_IMPORT = "github.com/jstemmer/go-junit-report"

inherit gosrc
inherit native
