SUMMARY = "go.mod: github.com/gobuffalo/buffalo"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/buffalo"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-buffalo-sources.inc

EXTRA_DEPENDS += "\
    github.com-burntsushi-toml-native \
    github.com-dustin-go-humanize-native \
    github.com-fatih-color-native \
    github.com-gobuffalo-envy-native \
    github.com-gobuffalo-events-native \
    github.com-gobuffalo-flect-native \
    github.com-gobuffalo-github-flavored-markdown-native \
    github.com-gobuffalo-helpers-native \
    github.com-gobuffalo-logger-native \
    github.com-gobuffalo-meta-native \
    github.com-gobuffalo-nulls-native \
    github.com-gobuffalo-plush-v4-native \
    github.com-gobuffalo-pop-v6-native \
    github.com-gobuffalo-tags-v3-native \
    github.com-gorilla-handlers-native \
    github.com-gorilla-mux-native \
    github.com-gorilla-sessions-native \
    github.com-karrick-godirwalk-native \
    github.com-markbates-grift-native \
    github.com-markbates-oncer-native \
    github.com-markbates-refresh-native \
    github.com-markbates-safe-native \
    github.com-monoculum-formam-native \
    github.com-sirupsen-logrus-native \
    github.com-spf13-cobra-native \
    gopkg.in-alexcesaro-quotedprintable.v3-native \
"

GO_IMPORT = "github.com/gobuffalo/buffalo"

inherit gosrc
inherit native
