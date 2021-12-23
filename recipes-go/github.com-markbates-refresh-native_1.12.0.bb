SUMMARY = "go.mod: github.com/markbates/refresh"
HOMEPAGE = "https://pkg.go.dev/github.com/markbates/refresh"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-markbates-refresh-sources.inc

EXTRA_DEPENDS += "\
    github.com-fatih-color-native \
    github.com-fsnotify-fsnotify-native \
    github.com-mitchellh-go-homedir-native \
    github.com-spf13-cobra-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/markbates/refresh"

inherit gosrc
inherit native
