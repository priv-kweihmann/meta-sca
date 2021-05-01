SUMMARY = "go.mod: github.com/yudai/gojsondiff"
HOMEPAGE = "https://pkg.go.dev/github.com/yudai/gojsondiff"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yudai-gojsondiff-sources.inc

EXTRA_DEPENDS += "\
    github.com-codegangsta-cli-native \
    github.com-onsi-ginkgo-native \
    github.com-sergi-go-diff-native \
    github.com-yudai-golcs-native \
"

GO_IMPORT = "github.com/yudai/gojsondiff"

inherit gosrc
inherit native
