SUMMARY = "go.mod: github.com/fsnotify/fsnotify"
HOMEPAGE = "https://pkg.go.dev/github.com/fsnotify/fsnotify"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fsnotify-fsnotify-sources.inc

GO_IMPORT = "github.com/fsnotify/fsnotify"

inherit gosrc
inherit native
