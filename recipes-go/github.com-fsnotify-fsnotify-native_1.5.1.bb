SUMMARY = "go.mod: github.com/fsnotify/fsnotify"
HOMEPAGE = "https://pkg.go.dev/github.com/fsnotify/fsnotify"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fsnotify-fsnotify-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/fsnotify/fsnotify"

inherit gosrc
inherit native
