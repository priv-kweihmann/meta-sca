SUMMARY = "go.mod: github.com/yoheimuta/protolint"
HOMEPAGE = "https://pkg.go.dev/github.com/yoheimuta/protolint"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yoheimuta-protolint-sources.inc

GO_IMPORT = "github.com/yoheimuta/protolint"

inherit gosrc
inherit native
