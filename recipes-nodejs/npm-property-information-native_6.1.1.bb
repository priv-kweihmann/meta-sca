SUMMARY = "NPM: property-information"
DESCRIPTION = "Info on the properties and attributes of the web platform"
HOMEPAGE = "https://github.com/wooorm/property-information#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/property-information/-/property-information-6.1.1.tgz"
SRC_URI[md5sum] = "fd37dbbbd82a49da5f4fb8ac8a0eb2bc"
SRC_URI[sha256sum] = "9bd1ddc4b7baa9d77a65282798b5186be453450182ea6608d94da30bd2309b74"

NPM_PKGNAME = "property-information"

inherit npmhelper
inherit native
