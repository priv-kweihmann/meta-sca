SUMMARY = "go.mod: github.com/xhit/go-str2duration/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/xhit/go-str2duration/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-xhit-go-str2duration-v2-sources.inc

GO_IMPORT = "github.com/xhit/go-str2duration/v2"

inherit gosrc
inherit native
