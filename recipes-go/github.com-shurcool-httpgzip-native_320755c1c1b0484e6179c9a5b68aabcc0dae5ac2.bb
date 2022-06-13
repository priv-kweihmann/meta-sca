SUMMARY = "go.mod: github.com/shurcooL/httpgzip"
HOMEPAGE = "https://pkg.go.dev/github.com/shurcooL/httpgzip"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shurcool-httpgzip-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-net-native \
"

GO_IMPORT = "github.com/shurcooL/httpgzip"

UPSTREAM_CHECK_COMMITS = "1"

inherit gosrc
inherit native
