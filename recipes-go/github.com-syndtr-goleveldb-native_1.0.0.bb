SUMMARY = "go.mod: github.com/syndtr/goleveldb"
HOMEPAGE = "https://pkg.go.dev/github.com/syndtr/goleveldb"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-syndtr-goleveldb-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-snappy-native \
    github.com-onsi-ginkgo-native \
    github.com-onsi-gomega-native \
"

GO_IMPORT = "github.com/syndtr/goleveldb"

inherit gosrc
inherit native
