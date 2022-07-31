SUMMARY = "go.mod: github.com/rogpeppe/fastuuid"
HOMEPAGE = "https://pkg.go.dev/github.com/rogpeppe/fastuuid"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rogpeppe-fastuuid-sources.inc

GO_IMPORT = "github.com/rogpeppe/fastuuid"
inherit gosrc
inherit nativesdk
