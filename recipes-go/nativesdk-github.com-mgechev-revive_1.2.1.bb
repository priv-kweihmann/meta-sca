SUMMARY = "go.mod: github.com/mgechev/revive"
HOMEPAGE = "https://pkg.go.dev/github.com/mgechev/revive"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mgechev-revive-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-burntsushi-toml \
    nativesdk-github.com-chavacava-garif \
    nativesdk-github.com-fatih-color \
    nativesdk-github.com-fatih-structtag \
    nativesdk-github.com-mgechev-dots \
    nativesdk-github.com-mitchellh-go-homedir \
    nativesdk-github.com-olekukonko-tablewriter \
    nativesdk-github.com-pkg-errors \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "github.com/mgechev/revive"
inherit gosrc
inherit nativesdk
