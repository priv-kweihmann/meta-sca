SUMMARY = "go.mod: github.com/Masterminds/sprig"
HOMEPAGE = "https://pkg.go.dev/github.com/Masterminds/sprig"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-masterminds-sprig-sources.inc

EXTRA_DEPENDS += "\
    github.com-google-uuid-native \
    github.com-huandu-xstrings-native \
    github.com-imdario-mergo-native \
    github.com-masterminds-goutils-native \
    github.com-masterminds-semver-native \
    github.com-mitchellh-copystructure-native \
    golang.org-x-crypto-native \
"

GO_IMPORT = "github.com/Masterminds/sprig"

inherit gosrc
inherit native
