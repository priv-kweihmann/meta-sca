SUMMARY = "NPM: property-information"
DESCRIPTION = "Information for HTML properties"
HOMEPAGE = "https://github.com/wooorm/property-information#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/property-information/-/property-information-6.0.0.tgz"
SRC_URI[md5sum] = "f90c289baa2a7e09b54f354a3bdaa898"
SRC_URI[sha256sum] = "560ade02d6987190a0b94fea442f615c265cda86b12ed1986d0c3088d058ca03"

NPM_PKGNAME = "property-information"

inherit npmhelper
inherit native
