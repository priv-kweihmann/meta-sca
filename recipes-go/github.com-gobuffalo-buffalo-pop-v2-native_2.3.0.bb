SUMMARY = "go.mod: github.com/gobuffalo/buffalo-pop/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/buffalo-pop/v2"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-buffalo-pop-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-fatih-color-native \
    github.com-gobuffalo-buffalo-native \
    github.com-gobuffalo-events-native \
    github.com-gobuffalo-flect-native \
    github.com-gobuffalo-genny-v2-native \
    github.com-gobuffalo-packr-v2-native \
    github.com-gobuffalo-plush-v4-native \
    github.com-gobuffalo-pop-v5-native \
    github.com-markbates-errx-native \
    github.com-pkg-errors-native \
    github.com-sirupsen-logrus-native \
    github.com-spf13-cobra-native \
"

GO_IMPORT = "github.com/gobuffalo/buffalo-pop/v2"

inherit gosrc
inherit native
