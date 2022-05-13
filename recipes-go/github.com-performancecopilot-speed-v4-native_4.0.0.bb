SUMMARY = "go.mod: github.com/performancecopilot/speed/v4"
HOMEPAGE = "https://pkg.go.dev/github.com/performancecopilot/speed/v4"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-performancecopilot-speed-v4-sources.inc

EXTRA_DEPENDS += "\
    github.com-edsrzf-mmap-go-native \
    github.com-hdrhistogram-hdrhistogram-go-native \
    github.com-pkg-errors-native \
"

GO_IMPORT = "github.com/performancecopilot/speed/v4"

inherit gosrc
inherit native
