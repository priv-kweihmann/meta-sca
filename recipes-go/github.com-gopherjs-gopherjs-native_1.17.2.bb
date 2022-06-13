SUMMARY = "go.mod: github.com/gopherjs/gopherjs"
HOMEPAGE = "https://pkg.go.dev/github.com/gopherjs/gopherjs"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gopherjs-gopherjs-sources.inc

EXTRA_DEPENDS += "\
    github.com-fsnotify-fsnotify-native \
    github.com-neelance-astrewrite-native \
    github.com-neelance-sourcemap-native \
    github.com-shurcool-httpfs-native \
    github.com-sirupsen-logrus-native \
    github.com-spf13-cobra-native \
    github.com-spf13-pflag-native \
    golang.org-x-crypto-native \
    golang.org-x-sync-native \
    golang.org-x-sys-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/gopherjs/gopherjs"

# needs CGO
do_compile[noexec] = "1"

inherit gosrc
inherit native
