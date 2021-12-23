SUMMARY = "go.mod: github.com/mitchellh/copystructure"
HOMEPAGE = "https://pkg.go.dev/github.com/mitchellh/copystructure"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mitchellh-copystructure-sources.inc

EXTRA_DEPENDS += "\
    github.com-mitchellh-reflectwalk-native \
"

GO_IMPORT = "github.com/mitchellh/copystructure"

inherit gosrc
inherit native
