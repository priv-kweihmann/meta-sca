SUMMARY = "go.mod: go.uber.org/multierr"
HOMEPAGE = "https://pkg.go.dev/go.uber.org/multierr"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.uber.org-multierr-sources.inc
require go.uber.org-atomic-sources.inc

GO_IMPORT = "go.uber.org/multierr"

inherit gosrc
inherit native
