SUMMARY = "go.mod: github.com/performancecopilot/speed"
HOMEPAGE = "https://pkg.go.dev/github.com/performancecopilot/speed"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-performancecopilot-speed-sources.inc

EXTRA_DEPENDS += "\
    github.com-codahale-hdrhistogram-native \
    github.com-edsrzf-mmap-go-native \
    go.uber.org-zap-native \
"

GO_IMPORT = "github.com/performancecopilot/speed"

inherit gosrc
inherit native
