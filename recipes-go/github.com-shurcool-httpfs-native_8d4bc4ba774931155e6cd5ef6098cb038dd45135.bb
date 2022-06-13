SUMMARY = "go.mod: github.com/shurcooL/httpfs"
HOMEPAGE = "https://pkg.go.dev/github.com/shurcooL/httpfs"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shurcool-httpfs-sources.inc

GO_IMPORT = "github.com/shurcooL/httpfs"

UPSTREAM_CHECK_COMMITS = "1"

inherit gosrc
inherit native
