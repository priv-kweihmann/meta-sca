SUMMARY = "go.mod: go.uber.org/multierr"
HOMEPAGE = "https://pkg.go.dev/go.uber.org/multierr"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.uber.org-multierr-sources.inc

EXTRA_DEPENDS += "\
    go.uber.org-atomic-native \
"

GO_IMPORT = "go.uber.org/multierr"

inherit gosrc
inherit native
