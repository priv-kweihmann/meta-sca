SUMMARY = "go.mod: github.com/google/pprof"
HOMEPAGE = "https://pkg.go.dev/github.com/google/pprof"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-pprof-sources.inc

GO_IMPORT = "github.com/google/pprof"

inherit gosrc
inherit native
