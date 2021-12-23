SUMMARY = "go.mod: github.com/onsi/gomega"
HOMEPAGE = "https://pkg.go.dev/github.com/onsi/gomega"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-onsi-gomega-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
    golang.org-x-net-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/onsi/gomega"

inherit gosrc
inherit native
