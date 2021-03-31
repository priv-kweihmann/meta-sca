SUMMARY = "go.mod: github.com/opentracing/opentracing-go"
HOMEPAGE = "https://pkg.go.dev/github.com/opentracing/opentracing-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-opentracing-opentracing-go-sources.inc
require github.com-creack-pty-sources.inc
require github.com-davecgh-go-spew-sources.inc
require github.com-kr-pretty-sources.inc
require github.com-kr-text-sources.inc
require github.com-pmezard-go-difflib-sources.inc
require github.com-stretchr-objx-sources.inc
require github.com-stretchr-testify-sources.inc
require gopkg.in-check.v1-sources.inc
require gopkg.in-yaml.v3-sources.inc

GO_IMPORT = "github.com/opentracing/opentracing-go"

inherit gosrc
inherit native
