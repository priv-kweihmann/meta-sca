SUMMARY = "NPM: property-information"
DESCRIPTION = "Info on the properties and attributes of the web platform"
HOMEPAGE = "https://github.com/wooorm/property-information#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/property-information/-/property-information-6.1.0.tgz"
SRC_URI[md5sum] = "acbd61288cbb307048e13575c2b76a46"
SRC_URI[sha256sum] = "06b2b1708a8b6e30a99260fdf3969b065252b4a2498b9aebe6c120b5a89b942e"

NPM_PKGNAME = "property-information"

inherit npmhelper
inherit native
