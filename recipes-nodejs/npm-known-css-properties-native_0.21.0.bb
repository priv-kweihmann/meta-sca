SUMMARY = "NPM: known-css-properties"
DESCRIPTION = "List of known CSS properties"
HOMEPAGE = "https://github.com/known-css/known-css-properties#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37549544f16ed84cd09a09af0e78977f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/known-css-properties/-/known-css-properties-0.21.0.tgz"
SRC_URI[md5sum] = "ce7dccbb25cd71a7e9f11e5471750069"
SRC_URI[sha256sum] = "8503b73c5b9f692a96461e26da054ad5c35bbecf1bf4d9a6c4becf89fe6e024f"

NPM_PKGNAME = "known-css-properties"

inherit npmhelper
inherit native
