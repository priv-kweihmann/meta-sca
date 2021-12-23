SUMMARY = "go.mod: github.com/gobuffalo/buffalo"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/buffalo"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-buffalo-sources.inc

EXTRA_DEPENDS += "\
    github.com-burntsushi-toml-native \
    github.com-dustin-go-humanize-native \
    github.com-fatih-color-native \
    github.com-gobuffalo-attrs-native \
    github.com-gobuffalo-buffalo-pop-v2-native \
    github.com-gobuffalo-clara-v2-native \
    github.com-gobuffalo-envy-native \
    github.com-gobuffalo-events-native \
    github.com-gobuffalo-flect-native \
    github.com-gobuffalo-genny-v2-native \
    github.com-gobuffalo-github-flavored-markdown-native \
    github.com-gobuffalo-helpers-native \
    github.com-gobuffalo-httptest-native \
    github.com-gobuffalo-logger-native \
    github.com-gobuffalo-meta-native \
    github.com-gobuffalo-nulls-native \
    github.com-gobuffalo-packd-native \
    github.com-gobuffalo-packr-v2-native \
    github.com-gobuffalo-plush-v4-native \
    github.com-gobuffalo-pop-v5-native \
    github.com-gobuffalo-tags-v3-native \
    github.com-gorilla-handlers-native \
    github.com-gorilla-mux-native \
    github.com-gorilla-sessions-native \
    github.com-karrick-godirwalk-native \
    github.com-markbates-grift-native \
    github.com-markbates-oncer-native \
    github.com-markbates-refresh-native \
    github.com-markbates-safe-native \
    github.com-markbates-sigtx-native \
    github.com-monoculum-formam-native \
    github.com-sirupsen-logrus-native \
    github.com-spf13-cobra-native \
    github.com-spf13-pflag-native \
    github.com-spf13-viper-native \
    github.com-stretchr-testify-native \
    golang.org-x-sync-native \
    golang.org-x-tools-native \
    gopkg.in-alexcesaro-quotedprintable.v3-native \
"

GO_IMPORT = "github.com/gobuffalo/buffalo"

inherit gosrc
inherit native
