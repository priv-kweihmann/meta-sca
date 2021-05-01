SUMMARY = "go.mod: github.com/sirupsen/logrus"
HOMEPAGE = "https://pkg.go.dev/github.com/sirupsen/logrus"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sirupsen-logrus-sources.inc

EXTRA_DEPENDS += "\
    github.com-stretchr-testify-native \
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/sirupsen/logrus"

inherit gosrc
inherit native
