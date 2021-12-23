SUMMARY = "go.mod: github.com/yudai/golcs"
HOMEPAGE = "https://pkg.go.dev/github.com/yudai/golcs"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yudai-golcs-sources.inc

GO_IMPORT = "github.com/yudai/golcs"

inherit gosrc
inherit native
