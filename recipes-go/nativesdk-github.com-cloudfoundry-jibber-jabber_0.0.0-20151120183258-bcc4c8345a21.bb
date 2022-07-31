SUMMARY = "go.mod: github.com/cloudfoundry/jibber_jabber"
HOMEPAGE = "https://pkg.go.dev/github.com/cloudfoundry/jibber_jabber"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-cloudfoundry-jibber-jabber-sources.inc

GO_IMPORT = "github.com/cloudfoundry/jibber_jabber"
inherit gosrc
inherit nativesdk
