SUMMARY = "go.mod: github.com/gobuffalo/genny/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/genny/v2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-genny-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-gobuffalo-logger-native \
    github.com-gobuffalo-packd-native \
    github.com-gobuffalo-plush-v4-native \
    github.com-markbates-oncer-native \
    github.com-markbates-safe-native \
    github.com-sirupsen-logrus-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/gobuffalo/genny/v2"

inherit gosrc
inherit native
