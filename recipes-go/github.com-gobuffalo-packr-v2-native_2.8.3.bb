SUMMARY = "go.mod: github.com/gobuffalo/packr/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/packr/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-packr-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-gobuffalo-logger-native \
    github.com-gobuffalo-packd-native \
    github.com-karrick-godirwalk-native \
    github.com-markbates-errx-native \
    github.com-markbates-oncer-native \
    github.com-markbates-safe-native \
    github.com-rogpeppe-go-internal-native \
    github.com-sirupsen-logrus-native \
    github.com-spf13-cobra-native \
    golang.org-x-sync-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/gobuffalo/packr/v2"

inherit gosrc
inherit native
