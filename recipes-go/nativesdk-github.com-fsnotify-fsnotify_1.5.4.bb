SUMMARY = "go.mod: github.com/fsnotify/fsnotify"
HOMEPAGE = "https://pkg.go.dev/github.com/fsnotify/fsnotify"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fsnotify-fsnotify-sources.inc

EXTRA_DEPENDS += "nativesdk-golang.org-x-sys"
GO_IMPORT = "github.com/fsnotify/fsnotify"
inherit gosrc
inherit nativesdk
