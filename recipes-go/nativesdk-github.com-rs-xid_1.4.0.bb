SUMMARY = "go.mod: github.com/rs/xid"
HOMEPAGE = "https://pkg.go.dev/github.com/rs/xid"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rs-xid-sources.inc

GO_IMPORT = "github.com/rs/xid"
inherit gosrc
inherit nativesdk
