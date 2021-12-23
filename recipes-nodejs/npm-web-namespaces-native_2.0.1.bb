SUMMARY = "NPM: web-namespaces"
DESCRIPTION = "Map of web namespaces"
HOMEPAGE = "https://github.com/wooorm/web-namespaces#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/web-namespaces/-/web-namespaces-2.0.1.tgz"
SRC_URI[md5sum] = "5cbc72ac45c3e144ba1998d8d2821e55"
SRC_URI[sha256sum] = "df250d9dc73331f79700486335f046bdebb09158d172754220cc546fb5149a84"

NPM_PKGNAME = "web-namespaces"

inherit npmhelper
inherit native
