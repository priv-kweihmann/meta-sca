SUMMARY = "go.mod: github.com/creack/pty"
HOMEPAGE = "https://pkg.go.dev/github.com/creack/pty"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-creack-pty-sources.inc

GO_IMPORT = "github.com/creack/pty"
inherit gosrc
inherit nativesdk
