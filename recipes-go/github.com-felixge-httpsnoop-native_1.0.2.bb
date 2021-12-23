SUMMARY = "go.mod: github.com/felixge/httpsnoop"
HOMEPAGE = "https://pkg.go.dev/github.com/felixge/httpsnoop"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-felixge-httpsnoop-sources.inc

GO_IMPORT = "github.com/felixge/httpsnoop"

inherit gosrc
inherit native
