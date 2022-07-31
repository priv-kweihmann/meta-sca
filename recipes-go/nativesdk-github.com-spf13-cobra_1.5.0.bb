SUMMARY = "go.mod: github.com/spf13/cobra"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/cobra"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-cobra-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-cpuguy83-go-md2man-v2 \
    nativesdk-github.com-inconshreveable-mousetrap \
    nativesdk-github.com-spf13-pflag \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/spf13/cobra"
inherit gosrc
inherit nativesdk
