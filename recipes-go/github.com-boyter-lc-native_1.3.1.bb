SUMMARY = "go.mod: github.com/boyter/lc"
HOMEPAGE = "https://pkg.go.dev/github.com/boyter/lc"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-boyter-lc-sources.inc
require github.com-boyter-golangvectorspace-sources.inc
require github.com-briandowns-spinner-sources.inc
require github.com-burntsushi-toml-sources.inc
require github.com-cpuguy83-go-md2man-v2-sources.inc
require github.com-fatih-color-sources.inc
require github.com-mattn-go-colorable-sources.inc
require github.com-mattn-go-isatty-sources.inc
require github.com-russross-blackfriday-v2-sources.inc
require github.com-ryanuber-columnize-sources.inc
require github.com-tealeg-xlsx-sources.inc
require github.com-urfave-cli-sources.inc
require golang.org-x-sys-sources.inc
require gopkg.in-yaml.v2-sources.inc

GO_IMPORT = "github.com/boyter/lc"

inherit gosrc
inherit native
