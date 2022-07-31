SUMMARY = "go.mod: github.com/gopherjs/gopherjs"
HOMEPAGE = "https://pkg.go.dev/github.com/gopherjs/gopherjs"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gopherjs-gopherjs-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-fsnotify-fsnotify \
    nativesdk-github.com-neelance-astrewrite \
    nativesdk-github.com-neelance-sourcemap \
    nativesdk-github.com-shurcool-httpfs \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-github.com-spf13-cobra \
    nativesdk-github.com-spf13-pflag \
    nativesdk-golang.org-x-crypto \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "github.com/gopherjs/gopherjs"
# needs CGO
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
