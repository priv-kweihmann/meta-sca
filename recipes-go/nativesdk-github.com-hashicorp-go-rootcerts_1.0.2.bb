SUMMARY = "go.mod: github.com/hashicorp/go-rootcerts"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-rootcerts"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-rootcerts-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-mitchellh-go-homedir"
GO_IMPORT = "github.com/hashicorp/go-rootcerts"
inherit gosrc
inherit nativesdk
