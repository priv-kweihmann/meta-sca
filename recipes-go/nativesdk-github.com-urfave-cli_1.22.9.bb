SUMMARY = "go.mod: github.com/urfave/cli"
HOMEPAGE = "https://pkg.go.dev/github.com/urfave/cli"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-urfave-cli-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-burntsushi-toml \
    nativesdk-github.com-cpuguy83-go-md2man-v2 \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/urfave/cli"
inherit gosrc
inherit nativesdk
