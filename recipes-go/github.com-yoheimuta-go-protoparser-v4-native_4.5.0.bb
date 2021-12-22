SUMMARY = "go.mod: github.com/yoheimuta/go-protoparser/v4"
HOMEPAGE = "https://pkg.go.dev/github.com/yoheimuta/go-protoparser/v4"
DEFAULT_PREFERENCE = "-1"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yoheimuta-go-protoparser-v4-sources.inc

GO_IMPORT = "github.com/yoheimuta/go-protoparser/v4"

inherit gosrc
inherit native
