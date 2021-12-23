SUMMARY = "go.mod: github.com/jessevdk/go-flags"
HOMEPAGE = "https://pkg.go.dev/github.com/jessevdk/go-flags"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jessevdk-go-flags-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/jessevdk/go-flags"

inherit gosrc
inherit native
