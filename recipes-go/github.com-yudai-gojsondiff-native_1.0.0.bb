SUMMARY = "go.mod: github.com/yudai/gojsondiff"
HOMEPAGE = "https://pkg.go.dev/github.com/yudai/gojsondiff"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yudai-gojsondiff-sources.inc

GO_IMPORT = "github.com/yudai/gojsondiff"

inherit gosrc
inherit native
