SUMMARY = "go.mod: github.com/joho/godotenv"
HOMEPAGE = "https://pkg.go.dev/github.com/joho/godotenv"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-joho-godotenv-sources.inc

GO_IMPORT = "github.com/joho/godotenv"

inherit gosrc
inherit native
